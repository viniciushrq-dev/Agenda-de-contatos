package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoConexao {
    private static final String URL = "jdbc:sqlite:meu_banco.db"; // Caminho do banco de dados

    public static Connection conectar(){
        try {
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            return conn;
        }catch(SQLException e){
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
         }
         
         return null;
         
    }

    
}
