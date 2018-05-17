package test;

import model.Agenda;


public class AgendaTest {
	public static void main(String[] args) {
		//criando uma instancia da classe Agenda
		Agenda a = new Agenda();
		//String para separar as partes impressas
		String sp = "------------------------------------------------------\n"
				+"------------------------------------------------------\n";
		//adicionando novos contatos a agenda
		System.out.println("Adicionando Contatos...");
		a.add("Joao", "9000-0000", "j@h.com");
		a.add("Maria", "8000-0000", "m@h.com");
		a.add("Jose", "7000-0000", "js@h.com");
		a.add("Francisco", "96000-0000", "f@h.com");
		
		System.out.println("Imprimindo Contatos...");
		a.print();
		System.out.println(sp);

		System.out.println("Alterando Contatos...");
		a.update("Joao", "Joao K", "99000-1234", "j@hot.com");
		a.update("Maria","Maria J", "98000-1234", "m@hot.com");
		a.update("Jose", "Jose L", "97000-1234", null);
		
		System.out.println("Imprimindo Contatos...");
		a.print();
		System.out.println(sp);

		System.out.println("Removendo Contatos...");
		a.remove("Francisco");

		System.out.println("Imprimindo Contatos...");
		a.print();
		System.out.println(sp);

		System.out.println("Resultado da busca de Contato pelo Telefone(99000-1234):");
		System.out.println(a.getByFone("99000-1234"));
	}
}
