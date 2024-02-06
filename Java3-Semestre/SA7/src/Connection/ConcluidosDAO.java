import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Connection.ConnectionFactory;

public class ConcluidosDAO {
    private Connection connection;
    private List<Done> taskDones;

    public EstoqueDAO() {
        // Obtém uma conexão ao banco de dados ao instanciar o DAO
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS task_done (task VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            // Em caso de erro ao criar a tabela, lança uma exceção
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            // Garante que a conexão seja fechada mesmo em caso de exceção
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Lista todos os valores cadastrados
    public List<Done> listarTodos() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        taskDones = new ArrayList<>();

        try {
            // Prepara e executa a consulta SQL para selecionar todos os registros da tabela
            stmt = connection.prepareStatement("SELECT * FROM task_done");
            rs = stmt.executeQuery();

            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Estoque com os valores do
                // registro
                Done taskDone = new Done(
                        rs.getString("task"),
                        tasksDones.add(taskDone));
            }
        } catch (SQLException ex) {
            // Em caso de erro durante a consulta, imprime o erro
            System.out.println(ex);
        } finally {
            // Fecha a conexão, o PreparedStatement e o ResultSet
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
        return taskDones;
    }

    // Cadastra produto no banco
    public void cadastrar(String description) {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO task_done (task) VALUES (?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, description);

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
            JOptionPane.showMessageDialog(null, "Você Cadastrou a tarefa com sucesso ✅");
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualiza dados no banco
    public void atualizar(String description) {
        PreparedStatement stmt = null;
    
        String sql = "UPDATE task_done SET task = ? WHERE task = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, description);
    
            stmt.executeUpdate();
    
            System.out.println("Dados atualizados com sucesso");
            JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso ✅");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}
