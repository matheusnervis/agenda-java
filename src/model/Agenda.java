package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private static List<Contato> contatos;
	
	public static void main(String[] args) {
		contatos = new ArrayList<Contato>();
		
		add("Joao", "9000-0000", "j@h.com");
		add("Luc", "8000-0000", "l@h.com");
		add("Naruto", "7000-0000", "n@h.com");
		add("Goku", "99000-0666", "g@h.com");
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		System.out.println("\n\n");
		
		update(contatos.indexOf(new Contato("Joao")),
				"Joao K", "99000-1234", "j@hot.com");
		update(contatos.indexOf(new Contato("Luc")),
				"Luc J", "99000-1234", "l@hot.com");
		update(contatos.indexOf(new Contato("Naruto")),
				"Naruto L", "99000-1234", null);
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		System.out.println("\n\n");
		
		remove("Goku");
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}
	
	public static void add(String nome, String fone, String email) {
		contatos.add(new Contato(nome, fone, email));
	}
	
	public static void remove(String nome) {
		contatos.remove(contatos.indexOf(new Contato(nome)));
	}
	
	public static boolean contains(String nome) {
		return contatos.contains(new Contato(nome));
	}
	
	public static void update(Contato contato, String nome, String fone, String email) {
		update(contatos.indexOf(contato), nome, fone, email);
	}
	
	public static void update(String nomeAtual, String nome, String fone, String email) {
		update(contatos.indexOf(new Contato(nomeAtual)), nome, fone, email);
	}
	
	public static void update(int index, String nome, String fone, String email) {
		Contato contato = contatos.get(index);
		
		if (nome != null)
			contato.setNome(nome);
		if (fone != null)
			contato.setFone(fone);
		if (email != null)
			contato.setEmail(email);
	}
	
}
