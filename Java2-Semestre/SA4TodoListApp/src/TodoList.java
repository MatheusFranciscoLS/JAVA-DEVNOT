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

    // construtor
    public TodoList() {
        // Configuração da janela principal
        super("To-Do List App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 600, 600);

        // Inicializa o painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        // Inicializa campos de entrada, botões e JComboBox
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

        // Configuração de Listener para os Eventos

        addButton.addActionListener(e -> {
            addTask();
        });

        deleteButton.addActionListener(e -> {
            if (taskList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir", "Nenhuma Tarefa Selecionada",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                deleteTask();
            }
        });

        markDoneButton.addActionListener(e -> {
            if (taskList.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Selecione uma tarefa para concluir", "Nenhuma Tarefa Selecionada",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                markTaskDone();
            }
        });
        filterComboBox.addActionListener(e -> {
            filterTasks();
        });

        clearCompletedButton.addActionListener(e -> {
            clearCompletedTasks();
        });
        clearAll.addActionListener(e -> {
            clearAll();
        });

        taskInputField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask();
                }
            }
        });
    }

    // métodos (crud)
    private void addTask() { // Adicione essa função no botão para criar uma nova tarefa
        // Adiciona uma nova task à lista de tasks
        String taskDescription = taskInputField.getText().trim();// remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            taskInputField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Digite uma Tarefa para adicionar", "Nenhuma Tarefa Digitada",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            boolean confirmed = showConfirmationDialog();
            if (confirmed) {
                tasks.remove(selectedIndex);
                updateTaskList(); // Atualiza a lista após excluir uma tarefa
            }
        }
    }

    private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(true);
            updateTaskList();

            JOptionPane.showMessageDialog(this, "Tarefa Concluida", "Tarefa Concluida",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription());
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isDone()) {
                completedTasks.add(task);
            }
        }
        tasks.removeAll(completedTasks);
        updateTaskList();
    }

    private void clearAll() {
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir tudo?",
                "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            listModel.clear();
            tasks.clear();
        }
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isDone() ? " (Concluída)" : ""));
        }
    }

    public void run() {
        // Exibe a janela
        this.setVisible(true);
    }

    private boolean showConfirmationDialog() {
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir esta tarefa?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        return escolha == JOptionPane.YES_OPTION;
    }
}