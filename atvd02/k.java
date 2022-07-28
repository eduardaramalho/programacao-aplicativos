package atvd02;

import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora, minutos, segundos,totalminutos,min;
		
		System.out.println("Informe a hora:");
		hora = sc.nextInt();
		
		minutos = hora*60;
			
		System.out.println("A hora convertida em minutos é igual a: " + minutos);
				
		System.out.println("Informe o minuto:");
		min= sc.nextInt();
		
		totalminutos = minutos + min;
	
		System.out.println("Os minutos são iguais a: " + totalminutos);
		
		segundos = totalminutos * 60;
		
		System.out.println("Os segundos são iguais a : " + segundos);
		

	}

}
