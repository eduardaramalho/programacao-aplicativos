package atvd02;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		double salariofixo, comissao, totalsalario;
		double vendas;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o seu total de vendas: ");
		vendas = sc.nextInt();
		
		comissao = vendas * 0.04;
		
		System.out.println("Informe seu sal�rio SEM a comiss�o:");
		salariofixo = sc.nextInt();
		
		totalsalario = salariofixo + comissao;
		
		System.out.println("A comiss�o � igual a: " + comissao);
		System.out.println("O sal�rio final � igual a: " + totalsalario);
	}

}
