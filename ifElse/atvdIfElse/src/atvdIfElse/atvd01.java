package atvdIfElse;

import java.util.Scanner;

public class atvd01 {

	public static void main(String[] args) {
		int menu, num1, num2, num3;
		double raiz;
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------");
		System.out.println("Menu de opções:" + "\n 1 - Somar dois números" + "\n 2 - Raiz quadrada de um número");
		menu = sc.nextInt();
		if (menu == 1) {
			System.out.println("Informe um número:  ");
			num1 = sc.nextInt();

			System.out.println("Informe um número: ");
			num2 = sc.nextInt();

			System.out.println("Soma = " + (num1 + num2));

		} else if (menu==2){

			System.out.println("Informe um número: ");
			num3 = sc.nextInt();
			raiz = Math.sqrt(num3);

			System.out.println("Raiz Quadrada: " + raiz);

		}

		sc.close();
	}

}