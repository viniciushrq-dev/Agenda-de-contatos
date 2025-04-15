package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoInicializacao {
    public static void inicializar() {
        String clientesTabela = "CREATE TABLE IF NOT EXISTS clientes ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nome TEXT NOT NULL, "
                + "cpf TEXT NOT NULL UNIQUE);";
        
        String produtosTabela = "CREATE TABLE IF NOT EXISTS produtos ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nome TEXT NOT NULL, "
                + "quantidade INTEGER NOT NULL, "
                + "preco REAL NOT NULL);";
        
        try (Connection conn = BancoConexao.conectar(); 
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(clientesTabela);
            stmt.execute(produtosTabela);
            System.out.println("Tabelas criadas ou verificadas com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar as tabelas: " + e.getMessage());
        }
    }
}
