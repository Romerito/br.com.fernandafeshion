package bootstrap.cliente;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 61 9 8611-5721
 *
 */

public class ClienteDAOHibernate implements ClienteDAO {
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session; 
	}

	@Override
	public void salvar(Cliente cliente) {
		this.session.save(cliente);
		
	}

	@Override
	public void atualizar(Cliente cliente) {
		
	}

	@Override
	public void excluir(Cliente cliente) {
		this.session.delete(cliente);
		
	}

	@Override
	public Cliente carregar(Integer id) {
		return (Cliente) this.session.get(Cliente.class, id);
	}

	@Override
	public Cliente buscarPorLogin(String email) {
		String hql = "select c from Cliente c where c.email = :email";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("email", email);
		return (Cliente) consulta.uniqueResult();
	}

	@Override
	public List<Cliente> listar() {
		return this.session.createCriteria(Cliente.class).list();
	}

}
