import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import javax.swing.*;

public class TodoList extends JFrame {
    // atributos

    private JPanel mainPanel;
    private JTextField taskInputField;
    private JButton addButton;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton clearCompletedButton;
    private JButton clearAll;
    private List<Task> tasks;

    // Construtor da classe TodoList
    public TodoList() {
        // Configuração da janela principal
        super("Minhas Tarefas"); // Define o título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação quando a janela é fechada
        this.setBounds(500, 100, 600, 500); // Define a posição e tamanho da janela

        try {
            // Inicialização do painel principal
            mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            // Inicialização das listas de tarefas
            tasks = new ArrayList<>();
            listModel = new DefaultListModel<>();
            taskList = new JList<>(listModel);

            // Inicialização de campos de entrada, botões e uma caixa de seleção (JComboBox)
            taskInputField = new JTextField();
            addButton = new JButton("Adicionar");
            deleteButton = new JButton("Excluir");
            markDoneButton = new JButton("Concluir");
            filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas", "Concluídas" });
            clearCompletedButton = new JButton("Limpar Concluídas");
            clearAll = new JButton("Limpar Tarefas");

            // Configuração do painel de entrada
            JPanel inputPanel = new JPanel(new BorderLayout());
            inputPanel.add(taskInputField, BorderLayout.CENTER);
            inputPanel.add(addButton, BorderLayout.EAST);

            // Configuração do painel de botões
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            buttonPanel.add(deleteButton);
            buttonPanel.add(markDoneButton);
            buttonPanel.add(filterComboBox);
            buttonPanel.add(clearCompletedButton);
            buttonPanel.add(clearAll);

            // Adiciona os componentes ao painel principal
            mainPanel.add(inputPanel, BorderLayout.NORTH);
            mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // Adiciona o painel principal à janela
            this.add(mainPanel);

            // Configuração de ouvintes (listeners) de eventos para os botões

            // Listener para o botão "Adicionar"
            addButton.addActionListener(e -> {
                try {
                    addTask();
                } catch (Exception ex) {
                    handleUserError(ex);
                }
            });

            // Listener para o botão "Excluir"
            deleteButton.addActionListener(e -> {
                try {
                    if (taskList.getSelectedIndex() == -1) {
                        showUserError("Selecione uma tarefa para excluir", "Nenhuma Tarefa Selecionada");
                    } else {
                        deleteTask();
                    }
                } catch (Exception ex) {
                    handleUserError(ex);
                }
            });

            // Listener para o botão "Concluir"
            markDoneButton.addActionListener(e -> {
                try {
                    if (taskList.getSelectedIndex() == -1) {
                        showUserError("Selecione uma tarefa para concluir", "Nenhuma Tarefa Selecionada");
                    } else {
                        markTaskDone();
                    }
                } catch (Exception ex) {
                    handleUserError(ex);
                }
            });

            // Listener para a caixa de seleção (JComboBox) para filtrar tarefas
            filterComboBox.addActionListener(e -> {
                filterTasks();
            });

            // Listener para o botão "Limpar Concluídas"
            clearCompletedButton.addActionListener(e -> {
                clearCompletedTasks();
            });

            // Listener para o botão "Limpar Tarefas"
            clearAll.addActionListener(e -> {
                clearAll();
            });

            // Listener para a tecla Enter no campo de entrada
            taskInputField.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    try {
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            addTask();
                        }
                    } catch (Exception ex) {
                        handleUserError(ex);
                    }
                }
            });
        } catch (Exception e) {
            handleUserError(e);
        }
    }

    // Métodos (CRUD) - Estes métodos manipulam as tarefas na lista.

    // Adiciona uma nova tarefa à lista
    private void addTask() {
        String taskDescription = taskInputField.getText().trim(); // Obtém a descrição da tarefa, removendo espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription); // Cria uma nova tarefa
            tasks.add(newTask); // Adiciona a tarefa à lista
            updateTaskList(); // Atualiza a lista de tarefas exibida na interface gráfica
            taskInputField.setText(""); // Limpa o campo de entrada
        } else {
            JOptionPane.showMessageDialog(this, "Digite uma Tarefa para adicionar", "Nenhuma Tarefa Digitada",
                    JOptionPane.WARNING_MESSAGE);
            // Mostra uma mensagem de aviso se nenhum texto foi digitado na descrição da
            // tarefa
        }
    }

    // Exclui a tarefa selecionada da lista
    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            boolean confirmed = showConfirmationDialog(); // Mostra uma caixa de diálogo de confirmação
            if (confirmed) {
                tasks.remove(selectedIndex); // Remove a tarefa selecionada
                updateTaskList(); // Atualiza a lista de tarefas na interface gráfica
            }
        }
    }

    // Marca a tarefa selecionada como concluída
    private void markTaskDone() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(true); // Define a tarefa como concluída
            updateTaskList(); // Atualiza a lista de tarefas na interface gráfica
            JOptionPane.showMessageDialog(this, "Tarefa Concluída", "Tarefa Concluída",
                    JOptionPane.INFORMATION_MESSAGE);
            // Exibe uma mensagem informando que a tarefa foi concluída
        }
    }

    // Filtra as tarefas com base na seleção da caixa de seleção (JComboBox)
    private void filterTasks() {
        String filter = (String) filterComboBox.getSelectedItem(); // Obtém o filtro selecionado
        listModel.clear(); // Limpa a lista exibida na interface gráfica
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") && !task.isDone())
                    || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription()); // Adiciona a tarefa à lista de acordo com o filtro
            }
        }
    }

    // Limpa as tarefas concluídas
    private void clearCompletedTasks() {
        try {
            List<Task> completedTasks = new ArrayList<>();
            for (Task task : tasks) {
                if (task.isDone()) {
                    completedTasks.add(task);
                }
            }
            if (completedTasks.isEmpty()) {
                showUserError("Nenhuma Tarefa Concluída.", "Erro Inesperado");
            } else {
                int escolha = JOptionPane.showConfirmDialog(this,
                        "Tem certeza que deseja excluir as Tarefas Concluídas?", "Tarefa Concluída",
                        JOptionPane.YES_NO_OPTION);
                if (escolha == JOptionPane.YES_OPTION) {
                    tasks.removeAll(completedTasks); // Remove as tarefas concluídas
                    updateTaskList(); // Atualiza a lista de tarefas
                }
            }
        } catch (Exception ex) {
            handleUserError(ex);
        }
    }

    // Limpa todas as tarefas
    private void clearAll() {
        try {
            if (tasks.isEmpty()) {
                showUserError("Nenhuma Tarefa Adicionada.", "Erro Inesperado");
            } else {
                int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir TODAS TAREFAS?",
                        "Tarefas", JOptionPane.YES_NO_OPTION);
                if (confirmacao == JOptionPane.YES_OPTION) {
                    listModel.clear(); // Limpa a lista de tarefas na interface gráfica
                    tasks.clear(); // Remove todas as tarefas
                }
            }
        } catch (Exception ex) {
            handleUserError(ex);
        }
    }

    // Atualiza a lista de tarefas exibida na GUI
    private void updateTaskList() {
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isDone() ? " (Concluída)" : ""));
            // Adiciona tarefas à lista com indicação de conclusão
        }
    }

    // Exibe a janela
    public void run() {
        this.setVisible(true);
    }

    // Lida com erros do usuário
    private void handleUserError(Exception ex) {
        ex.printStackTrace(); // Imprime o erro no console
        showUserError("Nenhuma Tarefa Adicionada.", "Erro Inesperado");
    }

    // Exibe uma mensagem de erro para o usuário
    private void showUserError(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
    }

    // Mostra uma caixa de diálogo de confirmação
    private boolean showConfirmationDialog() {
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir esta tarefa?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        return escolha == JOptionPane.YES_OPTION;
    }

    // Define exceções personalizadas para o caso de nenhuma tarefa estar presente
    class NoTasksException extends Exception {
        public NoTasksException(String message) {
            super(message);
        }
    }

    // Define exceções personalizadas para o caso de nenhuma tarefa concluída estar
    // presente
    class NoCompletedTasksException extends Exception {
        public NoCompletedTasksException(String message) {
            super(message);
        }
    }
}