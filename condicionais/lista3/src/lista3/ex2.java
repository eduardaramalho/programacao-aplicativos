package lista3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, notaExame;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Média: " + media);
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		if(media >= 3 && media < 7) {
			System.out.println("Em exame");
			notaExame = 6 - media;
			System.out.println("Você precisa tirar " + notaExame + " pontos no exame final.");
		}
		if(media < 3) {
			System.out.println("Reprovado.");
		}
		sc.close();

	}

}
