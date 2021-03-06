package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.nakedbank.models.Cliente;

public class ClienteDao extends AbstractDao implements IDao<Cliente>{
	
	

	public ClienteDao(Connection conn) {
		super(conn);
		this.conn = conn;
	}

	@Override
	public Cliente save(Cliente model) throws Exception {
		String query = "insert into contas.tb_cliente (nome, cpf, rg, renda, telefone, email) values (?, ?, ?, ?, ?, ?);";

		PreparedStatement insertCliente = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertCliente.setString(1, model.getNome());
		insertCliente.setString(2, model.getCpf());
		insertCliente.setString(3, model.getRg());
		insertCliente.setFloat(4, model.getRenda());
		insertCliente.setString(5, model.getTelefone());
		insertCliente.setString(6, model.getEmail());
		
		int codigo = (Integer) this.saveSQL(insertCliente, "codigo");

		model.setCodigo(codigo);

		return model;

	}

	@Override
	public Cliente get(Object id) throws Exception {
		String query = "select * from contas.tb_cliente where codigo = ?";
		
		PreparedStatement selectCliente = conn.prepareStatement(query);
		selectCliente.setInt(1, (Integer) id);
		
		ResultSet rs = this.getSQL(selectCliente);

		
		Cliente cliente = new Cliente();
		cliente.setCodigo(rs.getInt("codigo"));
		cliente.setNome(rs.getString("nome"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setRg(rs.getString("rg"));
		cliente.setRenda(rs.getFloat("renda"));
		cliente.setTelefone(rs.getString("telefone"));
		cliente.setEmail(rs.getString("email"));
		
		rs.close();
		selectCliente.close();
		
		return cliente;
	}

	@Override
	public Cliente update(Object id, Cliente model) throws Exception {
		
//		UPDATE contas.tb_cliente
//		SET nome='', cpf='', rg='', renda=0, telefone='', email=''
//		WHERE codigo=nextval('contas.tb_cliente_codigo_seq'::regclass);

		
		String query = "update contas.tb_cliente set nome = ?, cpf = ?, rg = ?, renda = ?, telefone = ?, email = ? where codigo = ?;";

		PreparedStatement updateCliente = conn.prepareStatement(query);
		updateCliente.setString(1, model.getNome());
		updateCliente.setString(2, model.getCpf());
		updateCliente.setString(3, model.getRg());
		updateCliente.setFloat(4, model.getRenda());
		updateCliente.setString(5, model.getTelefone());
		updateCliente.setString(6, model.getEmail());
		updateCliente.setInt(7, (Integer)id);

		this.updateSQL(updateCliente);
		
		return model;

	}

	@Override
	public void delete(Object id) throws Exception {
		
		String query = "delete from contas.tb_cliente where codigo = ?;";

		PreparedStatement deleteCliente = conn.prepareStatement(query);
		deleteCliente.setInt(1, (Integer)id);
		
		this.deleteSQL(deleteCliente);

		

		
	}

}
