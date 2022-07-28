package atvd02;

import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		double reais,libraesterlina,bitcoin,dolaraustraliano;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade em reais:");
		reais = sc.nextDouble();
		
		dolaraustraliano = reais * 3.54; 
		libraesterlina = reais * 6.29;
		bitcoin = reais * 195.364;
		
		System.out.println("---------COTAÇÃO 02/05------");
		System.out.println("Valor em Dólar Australiano:" + dolaraustraliano);
		System.out.println("Valor em Libra Esterlina: " + libraesterlina);
		System.out.println("Valor em bitcoin: " + bitcoin);
	}

}
