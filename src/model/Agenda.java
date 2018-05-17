package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	// criando uma lista para armazenar os contatos da agenda
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public void add(String name, String fone, String email) {
		//criar um contato com os valores passados e adiciona na agenda
		contacts.add(new Contact(name, fone, email));
	}
	
	public void remove(String name) {
		//recupera o index de um contato pelo name e remove ele da agenda
		contacts.remove(indexOf(name));
	}
	
	public void remove(Contact contact) {
		//recupera o index de um contato pelo nome e remove ele da agenda
		contacts.remove(contact);
	}
	
	public int indexOf(Contact contact) {
		//retorna o index de um contato
		return contacts.indexOf(contact);
	}
	
	public int indexOf(String name) {
		//retorna o index de um contato fazendo a busca pelo nome
		return contacts.indexOf(new Contact(name));
	}
	
	public Contact get(String name) {
		//busca um contato pelo nome e retorna ele
		return contacts.get(indexOf(name));
	}
	
	public Contact getByFone(String fone) {
		for (Contact contact : contacts) {
			//passa por todos os contatos da agenda ate encontrar
			//um contato que possui o fone requerido
			if(contact.getFone().equals(fone))
				//retorna o contato encontrado
				return contact;
		}
		// se nenhum contato tiver o fone requerido, retorna null
		return null;
	}
	
	public List<Contact> getByFoneAll(String fone) {
		// cria uma lista de contatos temporaria
		List<Contact> resultado = new ArrayList<Contact>();
		
		for (Contact contact : contacts) {
			//passa por todos os contatos da agenda ate encontrar
			//um contato que possui o fone requerido
			if(contact.getFone().equals(fone))
				// adiciona o contato encontrado na lista temporaria
				resultado.add(contact);
		}
		// retorna a lista de contatos encontrados se houver,
		// senao retorna null
		return (resultado.size() != 0)? resultado : null;
	}
	public Contact getByEmail(String email) {
		for (Contact contact : contacts) {
			//passa por todos os contatos da agenda ate encontrar
			//um contato que possui o email requerido
			if(contact.getEmail().equals(email))
				//retorna o contato encontrado
				return contact;
		}
		// se nenhum contato tiver o email requerido, retorna null
		return null;
	}
	
	public List<Contact> getByEmailAll(String email) {
		// cria uma lista de contatos temporaria
		List<Contact> resultado = new ArrayList<Contact>();
		
		for (Contact contact : contacts) {
			//passa por todos os contatos da agenda ate encontrar
			//um contato que possui o email requerido
			if(contact.getFone().equals(email))
				// adiciona o contato encontrado na lista temporaria
				resultado.add(contact);
		}
		// retorna a lista de contatos encontrados se houver,
		// senao retorna null
		return (resultado.size() != 0)? resultado : null;
	}
	
	public boolean contains(String name) {
		// verifica se existe pelo menos um contato na agenda que possui o nome informado
		return contacts.contains(new Contact(name));
	}
	
	public void update(Contact contact, String name, String fone, String email) {
		// captura o index do contato passado e atualiza os dados
		// obs: seram atualizados os dados de um contato da lista que
		// seja equivalente ao contato passado para a funcao
		update(indexOf(contact), name, fone, email);
	}
	
	public void update(String nameAtual, String name, String fone, String email) {
		// captura o index do contato atraves do nome passado e atualiza os dados
		update(get(nameAtual), name, fone, email);
	}
	
	public void update(int index, String name, String fone, String email) {
		// atraves do index passado busca o contato e atualiza os dados
		contacts.get(index).update(name, fone, email);
	}
	
	public void print() {
		// imprime todos os contatos presentes na agenda
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
	
}
