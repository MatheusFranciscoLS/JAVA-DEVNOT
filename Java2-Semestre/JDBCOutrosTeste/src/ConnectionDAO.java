import java.sql.*;

import org.postgresql.core.ConnectionFactory;

public class ConnectionDAO {
    public void cleanup() {
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        try {
            stmt.executeUpdate("drop table tbt_basica");
            con.close();
        } catch (Exception e) {
            // Ignorar todos os erros
        }
    }

    public void doexample() throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        System.out.println("\nExecutando os testes:");
        // Criar a tabela que armazena os dados
        stmt.executeUpdate("create table tbt_basica (a int2)");
    }
}
