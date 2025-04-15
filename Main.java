
import database.BancoInicializacao;
import database.ClienteDAO;
import models.Cliente;


public class Main {
    public static void main(String[] args) {
      // Inicializar o banco de dados (criar tabelas)
      BancoInicializacao.inicializar();

      // Criar cliente e inserir no banco
      Cliente cliente = new Cliente("Vinicius Vieira", "41015190804");
      ClienteDAO.inserirCliente(cliente);

      // Buscar cliente por ID
      Cliente clienteBuscado = ClienteDAO.buscarClientePorId(1);
      if (clienteBuscado != null){
        System.out.println("Cliente encontrado: " + clienteBuscado.getNome());
      }else{
        System.out.println("Cliente não encontrado");
      }
}
}
