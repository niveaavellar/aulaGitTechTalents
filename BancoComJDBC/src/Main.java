import java.sql.Connection;
import java.time.LocalDate;

import br.com.nakedbank.config.DatabaseConnection;
import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.dao.ContaDao;
import br.com.nakedbank.models.Cliente;
import br.com.nakedbank.models.Conta;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Connection connection = DatabaseConnection.connect();
		
//		ClienteDao clienteDao = new ClienteDao(connection);
//		ContaDao contaDao = new ContaDao(connection);
//		Cliente cliente = clienteDao.get(3);
////		System.out.println(cliente);		
////		cliente.setEmail("nivea.avellar@gmail.com");
////		clienteDao.update(2, cliente);
//		
////		Cliente clienteInsert = new Cliente();
////		clienteInsert.setCpf("12345678912");
////		clienteInsert.setEmail("noiadaperifa@gmail.com");
////		clienteInsert.setNome("Noia");
////		clienteInsert.setRenda(50f);
////		clienteInsert.setRg("222222222");
////		clienteInsert.setTelefone("19987777777");
////		clienteDao.save(clienteInsert);
//		
//
////		clienteDao.delete(5);
//		
////		Conta contaGet = contaDao.get("1000");
////		System.out.println(contaGet);	
//
//		
//		
		Regras regras = new Regras(connection);
		
		Conta conta = regras.criarContaCorrente("Leinad", "99977755566", "4419283666", 100000f, "1991827366", "emaildoleniad@mail.com", "4422");
		
		System.out.println(conta);
		regras.adicionarTransacao(500f, conta.getNumero(), "Depósito");
		
		connection.close();

	}

}
