package View;

import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Connection.ClientesDAO;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.Clientes;

public class ClientesPainel extends JPanel {
    
    // Atributos(componentes)
    private JButton cadastrar, apagar, editar;
    private JTextField clienteCPFField, clientesNomeField, clientesSobrenomeField, clientesIdadeField, clientesCEPField;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // Construtor(GUI-JPanel)
    public ClientesPainel() {
        super();
        // entrada de dados

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("CPF"));

        clienteCPFField = new JTextField(20);
        inputPanel.add(clienteCPFField);
        inputPanel.add(new JLabel("Nome"));

        clientesNomeField = new JTextField(20);
        inputPanel.add(clientesNomeField);
        inputPanel.add(new JLabel("Sobrenome"));

        clientesSobrenomeField = new JTextField(20);
        inputPanel.add(clientesSobrenomeField);
        inputPanel.add(new JLabel("Idade"));

        clientesIdadeField = new JTextField(20);
        inputPanel.add(clientesIdadeField);
        inputPanel.add(new JLabel("CEP"));

        clientesCEPField = new JTextField(20);
        inputPanel.add(clientesCEPField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "CPF", "Nome", "Sobrenome", "Idade", "Cidade" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Cria o banco de dados caso não tenha sido criado
        new ClientesDAO().criaTabela();
        // incluindo elementos do banco na criação do painel
        atualizarTabela();

        // tratamento de eventos(construtor)
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    clienteCPFField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    clientesNomeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    clientesSobrenomeField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    clientesIdadeField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    clientesCEPField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });
    }

    // métodos (atualizar tabela)
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getCpf(), cliente.getNome(),

                    cliente.getSobrenome(), cliente.getIdade(), cliente.getCep() });
        }
    }
}
