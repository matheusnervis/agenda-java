package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public void add(String nome, String fone, String email) {
		contacts.add(new Contact(nome, fone, email));
	}
	
	public void remove(String nome) {
		contacts.remove(indexOf(nome));
	}
	
	public int indexOf(Contact contact) {
		return contacts.indexOf(contact);
	}
	
	public int indexOf(String nome) {
		return contacts.indexOf(new Contact(nome));
	}
	
	public Contact get(String nome) {
		return contacts.get(indexOf(nome));
	}
	
	public Contact getByFone(String fone) {
		for (Contact contact : contacts) {
			if(contact.getFone().equals(fone))
				return contact;
		}
		
		return null;
	}
	
	public List<Contact> getByFoneAll(String fone) {
		List<Contact> resultado = new ArrayList<Contact>();
		
		for (Contact contact : contacts) {
			if(contact.getFone().equals(fone))
				resultado.add(contact);
		}
		
		return resultado;
	}
	public Contact getByEmail(String email) {
		for (Contact contact : contacts) {
			if(contact.getEmail().equals(email))
				return contact;
		}
		
		return null;
	}
	
	public List<Contact> getByEmailAll(String email) {
		List<Contact> resultado = new ArrayList<Contact>();
		
		for (Contact contact : contacts) {
			if(contact.getFone().equals(email))
				resultado.add(contact);
		}
		
		return resultado;
	}
	
	public boolean contains(String nome) {
		return contacts.contains(new Contact(nome));
	}
	
	public void update(Contact contact, String nome, String fone, String email) {
		update(indexOf(contact), nome, fone, email);
	}
	
	public void update(String nomeAtual, String nome, String fone, String email) {
		update(get(nomeAtual), nome, fone, email);
	}
	
	public void update(int index, String nome, String fone, String email) {
		contacts.get(index).update(nome, fone, email);
	}
	
	public void print() {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
	
}
