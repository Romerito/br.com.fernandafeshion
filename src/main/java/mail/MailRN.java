package mail;
/**
 * @author Romerito Alencar 
 * email: romerito.alencar@gmail.com
 *
 *Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * telefone 61 9 8611-5721
 */
import java.util.Date;

/**
 * @author Romerito Alencar 
 * Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Telefone 61 3054-6909
 * E-Mail: romerito.alencar@gmail.com
 */
import util.DAOFactory;

public class MailRN {

	private MailDAO mailDAO;

	public MailRN() {
		this.mailDAO = DAOFactory.criarMailDAO();
	}

	public void salvar(Mail mail) {
		String email = mail.getEMail();
		if (email != null) {
			this.mailDAO.salvar(mail);
		}
	}
}