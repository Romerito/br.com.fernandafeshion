package bootstrap.cliente;

import java.util.List;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 5561 9 8611-5721
 *
 */

import util.DAOFactory;


/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 5561 9 8611-5721 61 3054-6909
 *
 */

public class ClienteRN {

	private ClienteDAO clienteDAO;

	public ClienteRN() {
		this.clienteDAO = DAOFactory.criarClienteDAO();
	}

	public void salvar(Cliente cliente) {

		Integer id = cliente.getId();
		if (id == null || id == 0) {
			this.clienteDAO.salvar(cliente);
		} else {
			this.clienteDAO.atualizar(cliente);
		}

	}

	public void excluir(Cliente cliente) {
		this.clienteDAO.excluir(cliente);

	}

	public Cliente carregar(Integer id) {
		return (Cliente) this.clienteDAO.carregar(id);
	}

	public Cliente buscarPorLogin(String email) {
		return this.clienteDAO.buscarPorLogin(email);
	}

	public List<Cliente> listar() {
		return this.clienteDAO.listar();
	}

}
