package atvd02;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		double salariominimo, salariofuncionario, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário mínimo:");
		salariominimo = sc.nextDouble();
		
		System.out.println("Informe o valor do seu salário:");
		salariofuncionario = sc.nextDouble();
		
		total = salariofuncionario/salariominimo; 
		
		System.out.println("A quantidade de salários mínimos é igual a: " + total);

	}

}
