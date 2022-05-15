package br.com.purple;

import br.com.purple.model.Audiobook;
import br.com.purple.model.Book;
import br.com.purple.model.Ebook;

public class Programa {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.titulo = "Sol da meia-noite";
		book1.autor = "Stephenie Meyer";
		book1.editora = "Intrínseca";
		book1.ano = 2020;
		
		Audiobook audiobook1 = new Audiobook();
		audiobook1.titulo = "Harry Potter e a Pedra Filosofal";
		audiobook1.autor = "J.K. Rowling";
		audiobook1.editora = "Rocco";
		audiobook1.ano = 1997;
		audiobook1.plataforma = "Spotify";
		
		Ebook ebook1 = new Ebook();
		ebook1.titulo = "Caraval";
		ebook1.autor = "Stephanie Garber";
		ebook1.editora = "Novo Conceito";
		ebook1.ano = 2016;
		ebook1.formato = "Mobi";
		
	}

}
