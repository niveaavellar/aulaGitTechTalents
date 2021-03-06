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
		

		Regras regras = new Regras(connection);
		
		Conta conta = regras.criarContaCorrente("Leinad", "99977755566", "4419283666", 100000f, "1991827366", "emaildoleniad@mail.com", "4422");
		
		System.out.println(conta);
		regras.adicionarTransacao(500f, conta.getNumero(), "Depósito");
		
		connection.close();

	}

}
