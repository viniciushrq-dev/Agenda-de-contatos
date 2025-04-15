package database;

import models.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

    public static void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpf) VALUES (?, ?)";
        
        try (Connection conn = BancoConexao.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            
            stmt.executeUpdate();
            System.out.println("✅ Cliente inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("❌ Erro ao inserir cliente: " + e.getMessage());
        }
    }

    public static Cliente buscarClientePorId(int id) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        Cliente cliente = null;
        
        try (Connection conn = BancoConexao.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                cliente = new Cliente(nome, cpf);
            }
        } catch (SQLException e) {
            System.out.println("❌ Erro ao buscar cliente: " + e.getMessage());
        }
        
        return cliente;
    }
}
