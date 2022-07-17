package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        		 
        		 int a, b;
         System.out.println("Digite o primeiro valor: ");
         a = scan.nextInt();
         System.out.println("Digite o segundo valor: ");
         b = scan.nextInt();	
         
         int soma = soma(a, b);
         int subtração = subtração (a,b);
         int multiplicação = multiplicação(a,b);
         Double divisão = divisão(a, b);
         
         System.out.println("Sua soma é: " + soma);
         System.out.println("Sua subtração é: " + subtração);
         System.out.println("Sua multipicação é: " + multiplicação);
         System.out.println("Sua divisão é: " + divisão);
	}
       
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtração(int a, int b) {
		return a - b;
	}
	
	public static int multiplicação (int a, int b) {
		return a * b;
	}
	public static Double divisão (double a, double b) {
		return (double) (a / b);
	}
}
