package bootstrap.cliente;

import java.util.List;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 61 9 8611-5721
 *
 */

public interface ClienteDAO {
	
	public void salvar(Cliente cliente);
	public void atualizar(Cliente cliente);
	public void excluir(Cliente cliente);
	public Cliente carregar(Integer id);
	public Cliente buscarPorLogin(String email);
	public List<Cliente> listar();

}
