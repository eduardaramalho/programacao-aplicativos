package atvd_SwtcCase;

import java.util.Scanner;

public class atvd_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double criterioA;
		double criterioB;
		
		System.out.println("Informe a quantidade de livros:");
		int qtdLivros = sc.nextInt();
		
		criterioA = (0.25*qtdLivros+7.50);
		criterioB = (0.50*qtdLivros+2.50);
		
		if (criterioA<criterioB) {
			System.out.println("Melhor op��o � o crit�rio A. Valor = " + criterioA);
		} else if (criterioB<criterioA)  {
			System.out.println("Melhor op��o � o crit�rio B. Valor = " + criterioB);

		}
	}

}
