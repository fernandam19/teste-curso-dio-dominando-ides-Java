package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		Gato gato = new Gato();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a =  2;
		int b =  3;
		System.out.println("Hello World!" + (a+b));*/
	}
	
}

class Livro {
	public String livro;
	public String npag;
}