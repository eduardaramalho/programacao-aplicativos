package atvd02;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		double precoatual, percentual, novopreco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o preço atual da gasolina:");
		precoatual = sc.nextDouble();
		
		percentual = precoatual * 0.10;
		novopreco = precoatual + percentual;
		
		System.out.println("O aumento é de: " + percentual);
		System.out.println("O novo preço da gasolina é: " + novopreco);

	}

}
