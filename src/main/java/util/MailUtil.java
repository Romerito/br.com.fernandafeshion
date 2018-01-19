package util;
/**
 * @author Romerito Alencar 
 * Empresa: James Softeware
 * wwww.jamessoftware.com.br
 * Telefone 61 3054-6909
 * E-Mail: romerito.alencar@gmail.com
 */
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class MailUtil {

    @Resource(name="java:/jboss/mail/javamail")
    private Session session;

    public void send(String addresses,String eMail, String topic, String textMessage) {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(eMail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
            message.setSubject(topic);
            message.setText(textMessage);

            Transport.send(message);
            
        } catch (MessagingException e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.WARNING, "Cannot send mail", e);
        }
    }
}