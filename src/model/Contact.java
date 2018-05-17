package model;

public class Contact {
	
	private String nome;
	private String fone;
	private String email;
	
	public Contact(String nome) {
		update(nome, null, null);
	}
	
	public Contact(String nome, String fone, String email) {
		update(nome, fone, email);
	}
	public void update(String nome, String fone, String email) {
		if (nome != null)
			setNome(nome);
		if (fone != null)
			setFone(fone);
		if (email != null)
			setEmail(email);
	}
	
	public void clean() {
		nome = null;
		fone = null;
		email = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contato(Nome: "+nome+"; Fone: "+fone+"; E-mail: "+email+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Contact other = (Contact) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		
		return true;
	}

}
