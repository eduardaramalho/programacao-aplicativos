package atvd02;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		double salariominimo, salariofuncionario, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do sal�rio m�nimo:");
		salariominimo = sc.nextDouble();
		
		System.out.println("Informe o valor do seu sal�rio:");
		salariofuncionario = sc.nextDouble();
		
		total = salariofuncionario/salariominimo; 
		
		System.out.println("A quantidade de sal�rios m�nimos � igual a: " + total);

	}

}
