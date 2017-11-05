package usuario;
import java.util.List;
/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 61 9 8611-5721
 *
 */
public interface UsuarioDAO {
	public void salvar(Usuario usuario);
	public void atualizar(Usuario usuario);
	public void excluir(Usuario usuario);
	public Usuario carregar(Integer codigo);
	public Usuario buscarPorLogin(String login);
	public List<Usuario> listar();
}
