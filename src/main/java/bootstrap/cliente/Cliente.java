package bootstrap.cliente;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Romerito Alencar email: romerito.alencar@gmail.com telefone 5561 9 8611-5721 61 3054-6909
 *
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	

	@Id
	@GeneratedValue
	private Integer 	id;
	private String 		name;
	@org.hibernate.annotations.NaturalId
	private String 		email;
	private String 		password;
	private String 		cep;
	private boolean 	envMail;
		


	public Cliente() {
		
	}
	

	public Cliente(Integer id, String name, String email, String password, String cep, boolean envMail) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cep = cep;
		this.envMail = envMail;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (envMail ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (envMail != other.envMail)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
