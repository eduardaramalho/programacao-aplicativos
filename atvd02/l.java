package atvd02;

import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double custoShow, precoIngresso, calculo;
		
		System.out.print("Informe o custo do show musical:");
		custoShow = sc.nextDouble();
		
		System.out.print("Informe o pre�o dos ingressos: ");
		precoIngresso = sc.nextDouble();
		
	    calculo = custoShow/precoIngresso;
	   
	    System.out.println("O n�mero de ingressos a serem vendidos � igual a: "+ calculo);

		
	}

}
