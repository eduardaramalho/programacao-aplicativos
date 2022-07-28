package lista3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		double notaLaboratorio,notaAvaliacao,notaExame,mediaNotas;

		System.out.print("Laboratório: ");
		notaLaboratorio = sc.nextDouble();
		System.out.print("Avaliação Semestral: ");
		notaAvaliacao = sc.nextDouble();
		System.out.print("Exame Final: ");
		notaExame = sc.nextDouble();

		mediaNotas = (notaLaboratorio * 2 + notaAvaliacao * 3 + notaExame * 5) / 10;

		System.out.println("Média final: " + mediaNotas);

		if (mediaNotas >= 8) {
			System.out.println("Conceito A");
		}
		if (mediaNotas >= 7 && mediaNotas < 8) {
			System.out.println("Conceito B");
		}
		if (mediaNotas >= 6 && mediaNotas < 7) {
			System.out.println("Conceito C");
		}
		if (mediaNotas >= 5 && mediaNotas < 6) {
			System.out.println("Conceito D");
		}
		if (mediaNotas >= 0 && mediaNotas < 5) {
			System.out.println("Conceito E");
		}

		sc.close();
	}

}
