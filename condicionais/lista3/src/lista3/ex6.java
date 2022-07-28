package lista3;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;

		System.out.println("Informe um número: ");
		num1 = sc.nextDouble();

		if (num1 % 2 == 0) {
			System.out.println("O número é par");
		}
		if (num1 % 2 == 1) {
			System.out.println("O número é impar");
		}
		sc.close();
	}

}
