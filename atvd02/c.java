package atvd02;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1,numero2;
		double divisao;
		
		System.out.println("Informe o primeiro n�mero:");
		numero1= sc.nextInt();
		
		if (numero1==0) {
			System.out.println("N�mero inv�lido, digite um n�mero maior que 0.");
		}
		
		System.out.println("Informe o segundo n�mero:");
		numero2= sc.nextInt();
		
		divisao = numero1%numero2; 
		
		System.out.println("O resto da divis�o dos dois n�meros � igual a:" + divisao );

	}

}
