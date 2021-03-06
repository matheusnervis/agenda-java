package model;

public class Contact {
	
	// atributos de um contato
	private String name;
	private String fone;
	private String email;
	
	public Contact(String nome) {
		// cria um contato com apenas o nome preenchido
		update(nome, null, null);
	}
	
	public Contact(String nome, String fone, String email) {
		// cria um contato e atualiza os atributos
		update(nome, fone, email);
	}
	public void update(String nome, String fone, String email) {
		// se os valores forem passados como null, os valores anteriores seram conservados
		// assim nao eh necessario repassar um valor que nao precisa ser alterado
		if (nome != null)
			setNome(nome);
		if (fone != null)
			setFone(fone);
		if (email != null)
			setEmail(email);
	}
	
	public void clean() {
		// altera para null a todos os atributos do objeto 
		name = null;
		fone = null;
		email = null;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
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
		return "Contato(Nome: "+name+"; Fone: "+fone+"; E-mail: "+email+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

}
