package lista3;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;

		System.out.println("Informe um n�mero: ");
		num1 = sc.nextDouble();

		if (num1 % 2 == 0) {
			System.out.println("O n�mero � par");
		}
		if (num1 % 2 == 1) {
			System.out.println("O n�mero � impar");
		}
		sc.close();
	}

}
