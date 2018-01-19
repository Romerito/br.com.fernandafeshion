package util;

import bootstrap.cliente.ClienteDAO;
import bootstrap.cliente.ClienteDAOHibernate;
import categoria.CategoriaDAO;
import categoria.CategoriaDAOHibernate;
import conta.ContaDAO;
import conta.ContaDAOHibernate;
import mail.MailDAO;
import mail.MailDAOHibernate;
import usuario.UsuarioDAO;
import usuario.UsuarioDAOHibernate;

public class DAOFactory {
	
	public static UsuarioDAO criarUsuarioDAO(){
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	public static ContaDAO criarContaDAO(){
		ContaDAOHibernate contaDAO = new ContaDAOHibernate();
		contaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contaDAO;
	}
	public static CategoriaDAO criarCategoriaDAO() {
		CategoriaDAOHibernate categoriaDAO = new CategoriaDAOHibernate();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return categoriaDAO;
	}
	public static MailDAO criarMailDAO() {
		MailDAOHibernate mailDAO = new MailDAOHibernate();
		mailDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return mailDAO;
	}
	public static ClienteDAO criarClienteDAO() {
		ClienteDAOHibernate clienteDAO = new ClienteDAOHibernate();
		clienteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return clienteDAO;
	}
}

		
		
		
		
	
				