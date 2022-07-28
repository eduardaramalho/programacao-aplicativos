package atvd02;

import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horastrabalhadas, horasextras, salariominimo, totalsalario,salariobruto,horatrabalhada,horaextra,receberhe;
		
		System.out.print("Valor do salário mínimo:");
		salariominimo = sc.nextDouble();
		
		System.out.print("Horas trabalhadas:");
		horastrabalhadas = sc.nextDouble();
		
		System.out.print("Horas extras:");
		horasextras = sc.nextDouble();
		
		horatrabalhada = salariominimo/6;
		horaextra=salariominimo/3;
		
		salariobruto = horastrabalhadas * horatrabalhada;
		receberhe = horasextras * horaextra;
		
		totalsalario = salariobruto + receberhe;
		
		System.out.println("Salário final com horas extras: " + totalsalario);
		
	}

}
