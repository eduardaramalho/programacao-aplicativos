package lista3;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4;

		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Informe o terceiro número: ");
		num3 = sc.nextDouble();
		System.out.println("Informe o quarto número: ");
		num4 = sc.nextDouble();

		if (num3 > num2 && num2 > num1) {

			if (num4 > num3) {
				System.out.println(num4);
			}
			System.out.println(num3);
			if (num4 > num2 && num4 <= num3) {
				System.out.println(num4);
			}
			System.out.println(num2);
			if (num4 > num1 && num4 <= num2) {
				System.out.println(num4);
			}
			System.out.println(num1);
			if (num4 <= num1) {
				System.out.println(num4);
			}
		}
		sc.close();

	}

}
