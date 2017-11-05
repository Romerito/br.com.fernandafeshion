package usuario;

import java.util.List;

import categoria.CategoriaRN;
import util.DAOFactory;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 5561 9
 *         8611-5721
 *
 */

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}

	public void salvar(Usuario usuario) {

		Integer codigo = usuario.getCodigo();
		if (codigo == null || codigo == 0) {

			usuario.getPermissao().add("ROLE_USUARIO");

			this.usuarioDAO.salvar(usuario);

			CategoriaRN categoriaRN = new CategoriaRN();
			categoriaRN.salvaEstruturaPadrao(usuario);

		} else {
			this.usuarioDAO.atualizar(usuario);
		}
	}

	public Usuario carregar(Integer codigo) {
		return this.usuarioDAO.carregar(codigo);
	}

	public Usuario buscarPorLogin(String login) {
		return this.usuarioDAO.buscarPorLogin(login);
	}

	public void excluir(Usuario usuario) {

		CategoriaRN categoriaRN = new CategoriaRN();
		categoriaRN.excluir(usuario);

		this.usuarioDAO.excluir(usuario);
	}

	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}

}