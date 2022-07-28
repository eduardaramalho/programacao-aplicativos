package atvd02;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1,numero2;
		double divisao;
		
		System.out.println("Informe o primeiro número:");
		numero1= sc.nextInt();
		
		if (numero1==0) {
			System.out.println("Número inválido, digite um número maior que 0.");
		}
		
		System.out.println("Informe o segundo número:");
		numero2= sc.nextInt();
		
		divisao = numero1%numero2; 
		
		System.out.println("O resto da divisão dos dois números é igual a:" + divisao );

	}

}
