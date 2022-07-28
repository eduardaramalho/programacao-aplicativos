package atvd02;

import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		double salario, contas, finalsalario,conta01,conta02,percentual,totalc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu salário:");
		salario = sc.nextDouble();
		
		System.out.println("Informe o valor da conta 01:");
		conta01 = sc.nextDouble();
		
		System.out.println("Informe o valor da conta 02:");
		conta02= sc.nextDouble();
		
		contas = conta01+conta02;
		
		System.out.println("O valor das duas contas é igual a: " + contas);
		percentual = contas * 0.05;
		totalc = contas - percentual;
		System.out.println("O valor das contas com desconto é igual a: " + totalc);
		
		finalsalario = salario - totalc;
		
		System.out.println("O que resta de seu salário é igual a: " + finalsalario);
		
	}

}
