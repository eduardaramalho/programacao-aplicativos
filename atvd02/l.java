package atvd02;

import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double custoShow, precoIngresso, calculo;
		
		System.out.print("Informe o custo do show musical:");
		custoShow = sc.nextDouble();
		
		System.out.print("Informe o preço dos ingressos: ");
		precoIngresso = sc.nextDouble();
		
	    calculo = custoShow/precoIngresso;
	   
	    System.out.println("O número de ingressos a serem vendidos é igual a: "+ calculo);

		
	}

}
