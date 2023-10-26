import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesAgenda {
    private List<Agenda> agendamentos;
    private DefaultTableModel tableModel;
    private JTable table;

    public OperacoesAgenda(List<Agenda> agendamentos, DefaultTableModel tableModel, JTable table) {
        this.agendamentos = agendamentos;
        this.tableModel = tableModel;
        this.table = table;
    }

    public void cadastrarAgenda(String usuarios, String hora, String data, String descricao) {
        Agenda agenda = new Agenda(usuarios, hora, data, descricao);
        agendamentos.add(agenda);
        atualizarTabela();
    }

    public void atualizarAgenda(int linhaSelecionada, String usuarios, String hora, String data, String descricao) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(usuarios, hora,data,descricao);
            agendamentos.set(linhaSelecionada, agenda);
            atualizarTabela();
        }
    }

    public void apagarAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendamentos.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosAgenda() {
        agendamentos.clear();
        atualizarTabela();
    }

    public void salvarAgenda() {
        Serializacao.serializar2("agenda.txt", agendamentos);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendamentos) {
            tableModel.addRow(new Object[] { agenda.getUsuario(), agenda.getHora(),agenda.getData(),agenda.getDescricao() });
        }
    }

}
