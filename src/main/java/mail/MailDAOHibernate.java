package mail;
/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 61 9 8611-5721
 *
 *Empresa: James Softeware
 * wwwwjamessoftware.com.br
 */
import org.hibernate.Session;

public class MailDAOHibernate implements MailDAO {
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session; 
	}

	public void salvar(Mail mail) {
		this.session.save(mail);
		
	}

}
