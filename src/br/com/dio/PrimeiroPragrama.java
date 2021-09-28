package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPragrama {

	public static void main(String[] args) {
		Gato gato = new Gato();
		 Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("HEllo world "+ (a+b));*/

	}
}
class livros {
	private String nome;
	private String numPaginas;
}