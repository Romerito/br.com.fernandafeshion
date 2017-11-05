package web;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.util.DigestUtils;

import bootstrap.cliente.Cliente;
import bootstrap.cliente.ClienteRN;
import conta.ContaRN;
import usuario.UsuarioRN;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 5561 9 8611-5721
 *
 */


@ManagedBean(name="clienteBean")
@RequestScoped
public class ClienteBean  implements Serializable{
	
	private Cliente 	cliente = new Cliente();
	private String 		name;
	private String 		email;
	private String  	password;
	private String 		cep;
	private boolean 	envMail;
	private String destinoSalvar = "index.html";
	
	public String salvar() {
		
		password = this.cliente.getPassaword();
		
		if(password != null && password.trim().length() == 0){
			String senhaCripto = DigestUtils.md5DigestAsHex(password.getBytes());
			this.cliente.setPassword(senhaCripto);
		
		}
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(this.cliente);
			
		return this.destinoSalvar;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public boolean isEnvMail() {
		return envMail;
	}

	public void setEnvMail(boolean envMail) {
		this.envMail = envMail;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	
	
	
}
