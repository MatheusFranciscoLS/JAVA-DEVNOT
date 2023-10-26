import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CadastroAgenda extends JPanel {
    private JTextField inputUsuario;
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputDescricao;
    private DefaultTableModel tableModel;
    private JTable table;

    private List<Agenda> agendamentos = new ArrayList<>();
    private int linhaSelecionada = -1;

    public CadastroAgenda() {

        // modelagem e criação da tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Descrição");
        
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // declaração dos componentes
        inputUsuario = new JTextField(20);
        inputData = new JTextField(10);
        inputHora = new JTextField(5);
        inputDescricao = new JTextField(15);

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton apagarTodosButton = new JButton("Apagar Todos");
        JButton salvarButton = new JButton("Salvar");
        JPanel inputPanel = new JPanel();

        // adicionar componente ao painel
        inputPanel.add(new JLabel("Usuario:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        // set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        File arquivo2 = new File("agenda.txt");
        if (arquivo2.exists()) {
            agendamentos = Serializacao.deserializar2("agenda.txt");
            atualizarTabela();
        }

        // métodos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputUsuario.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputData.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputHora.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputDescricao.setText(table.getValueAt(linhaSelecionada, 1).toString());
                }
            }
        });
        OperacoesAgenda operacoes = new OperacoesAgenda(agendamentos, tableModel, table);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarAgenda(inputUsuario.getText(), inputData.getText(), inputHora.getText(),
                        inputDescricao.getText());
                inputUsuario.setText("");
                inputData.setText("");
                inputHora.setText("");
                inputDescricao.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada, inputUsuario.getText(),
                        inputData.getText(),inputHora.getText(),inputDescricao.getText());
            }
        });


        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarAgenda(linhaSelecionada);
            }
        });
        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosAgenda();
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarAgenda();
            }
        });
        
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendamentos) {
            tableModel.addRow(new Object[] { agenda.getUsuario(), agenda.getData(),agenda.getHora(),agenda.getDescricao() });
        }
    }
    
}
