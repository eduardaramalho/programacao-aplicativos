package atvdIfElse;

import java.util.Scanner;

public class atvd06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario;
		int opcao;

		System.out.println("Menu de opções:");
		System.out.println("1. Imposto");
		System.out.println("2. Novo salário");
		System.out.println("3. Classificação");
		System.out.println("Digite a opção desejada:");
		opcao = sc.nextInt();
		while (opcao < 1 || opcao > 3) {
			System.out.println("Opção invalida. Digite uma opção valida:");
			opcao = sc.nextInt();
		}

		if (opcao == 1) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();

			if (salario < 500) {
				System.out.println("O imposto é:" + salario * 0.05 + "R$");
			} else if (salario >= 500 && salario <= 850) {
				System.out.println("O imposto é:" + salario * 0.10 + "R$");
			} else if (salario > 850) {
				System.out.println("O imposto é:" + salario * 0.15 + "R$");
			}
		} else if (opcao == 2) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();

			if (salario > 1500) {
				System.out.println("Novo salário:" + salario + 25 + "R$");
			} else if (salario >= 750 && salario <= 1500) {
				System.out.println("Novo salário:" + salario + 50 + "R$");
			} else if (salario >= 450 && salario < 750) {
				System.out.println("Novo salário:" + salario + 75 + "R$");
			} else if (salario < 450) {
				System.out.println("Novo salário:" + salario + 100 + "R$");
			}
		} else if (opcao == 3) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();

			if (salario <= 700) {
				System.out.println("Mal remunerado.");
			} else if (salario > 700) {
				System.out.println("Bem remunerado.");
			}
		}

	}
}