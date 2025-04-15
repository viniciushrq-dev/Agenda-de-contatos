package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {

    private static final String URL = "jdbc:sqlite:agenda.db";

    public static Connection conectar() {
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL);
            System.out.println("✅ Conexão com SQLite estabelecida.");
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar com o banco de dados.");
            e.printStackTrace();
        }

        return conexao;
    }
}
