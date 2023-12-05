package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.ClientesDAO;
import Model.ClientesVIP;

public class ClientesControl {

    // atributos
    private List<ClientesVIP> clientes;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public ClientesControl(List<ClientesVIP> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
        this.table = table;
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos(); // Obtém os carros atualizados do banco de dados
        for (ClientesVIP cliente : clientes) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getCpf(), cliente.getNome(), cliente.getTelefone() });
        }
    }

    public void cadastrar(String cpf, String nome, String telefone) {
        if (cpf.isEmpty() || nome.isEmpty()
        || telefone.isEmpty()) {
    JOptionPane.showMessageDialog(null, "ATENÇÃO! \nExistem campos em branco");
} else {
    if (!validarFormatoCPF(cpf)) {
        JOptionPane.showMessageDialog(null,
                "CPF inválido! O CPF deve conter apenas números e ter 11 dígitos.");
    } else if (!telefone.matches("[0-9]+") || telefone.length() < 11) {
        JOptionPane.showMessageDialog(null, "O campo 'Telefone' deve conter apenas números.");
        JOptionPane.showMessageDialog(null, "Adicione  no seguinte formato 19999999999.");
    } else if (!nome.matches("[a-zA-ZÀ-ú\\s]+")) {
        JOptionPane.showMessageDialog(null, "O campo 'Nome' deve conter apenas letras.");
    }

    else {
        // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de
        // entrada
        operacoes.cadastrar(cpf, nome, telefone);

        // Limpa os campos de entrada após a operação de cadastro
        cpf;
        nome;
        telefone;
    }
}

};

    public void atualizar(String cpf, String nome, String telefone) {
        if (cpf.isEmpty() || nome.isEmpty()
                || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! \nExistem campos em branco");
        } else {
            new ClientesDAO().atualizar(cpf, nome, telefone);
            atualizarTabela(); // Atualiza a tabela de exibição após a atualização
        }
    }

    public void apagar(String cpf) {
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para apagar.");
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja apagar os campos?",
                    "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
                // "placa"
                JOptionPane.showMessageDialog(null, "O Produto de Código "
                        + cpf + " foi deletado!");
            } else {
                JOptionPane.showMessageDialog(null, "O produto não foi deletado!");
            }
            new ClientesDAO().apagar(cpf);
            // Chama o método de exclusão no banco de dados
            atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
        }

    private boolean validarFormatoCPF(String cpf) {
        // Remove caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        return cpf.length() == 11;
    }
}