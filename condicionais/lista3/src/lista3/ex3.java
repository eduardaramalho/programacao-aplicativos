package lista3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Informe o primeiro n�mero:");
		num1 = sc.nextInt();

		System.out.println("Informe o segundo n�mero: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Maior n�mero: " + num1);
		}
		if (num2 > num1) {
			System.out.println("Maior n�mero: " + num2);
		}
		sc.close();
	}
}
