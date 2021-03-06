package bootstrap.cliente;

import java.util.List;
/**
 * @author Romerito Alencar 
 * Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Telefone 61 3054-6909
 * E-Mail: romerito.alencar@gmail.com
 */
import util.DAOFactory;

public class ClienteRN {

	private ClienteDAO clienteDAO;

	public ClienteRN() {
		this.clienteDAO = DAOFactory.criarClienteDAO();
	}

	public void salvar(Cliente cliente) {

		Integer id = cliente.getId();
		if (id == null || id == 0) {
			cliente.getPermissao().add("ROLE_USUARIO");
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
