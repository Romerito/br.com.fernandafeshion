package mail;
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