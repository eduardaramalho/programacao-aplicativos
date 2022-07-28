package lista3;

import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, x1, x2;

		System.out.println("Informe o valor de A:");
		a = sc.nextDouble();
		System.out.println("Informe o valor de B:");
		b = sc.nextDouble();
		System.out.println("Informe o valor de C:");
		c = sc.nextDouble();

		if (a == 0) {
			System.out.println("A deve ser diferente de 0!");
		} else {
			delta = Math.pow(b, 2) - (4 * a * c);

			if (delta < 0) {
				System.out.println("A sua equa��o n�o possui ra�zes reais.");
			} else if (delta == 0) {
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				System.out.println("Equa��o com uma raiz = " + x1);
			} else {
				x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
				x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("Primeira ra�z = " + x1 + " e segunda ra�z = " + x2);
			}
		}

		sc.close();
	}

}
