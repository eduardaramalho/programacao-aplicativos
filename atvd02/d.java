package atvd02;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		double precoatual, percentual, novopreco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o pre�o atual da gasolina:");
		precoatual = sc.nextDouble();
		
		percentual = precoatual * 0.10;
		novopreco = precoatual + percentual;
		
		System.out.println("O aumento � de: " + percentual);
		System.out.println("O novo pre�o da gasolina �: " + novopreco);

	}

}
