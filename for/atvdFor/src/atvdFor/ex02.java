package atvdFor;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int peso, idade=0, time1,time2, menores18=0, acima80=0, mediaIdade = 0, numJogadores = 3;
		double alt=0.0,  mediaAltura = 0;
		
		System.out.println("TIME 1");
		for (time1=1; time1<=3; time1++) {
			System.out.print("Idade:");
			idade = sc.nextInt();
			
			System.out.print("Peso:");
			peso = sc.nextInt();
			
			System.out.print("Altura:");
			alt = sc.nextDouble();
			
			if (idade<18) {
				menores18++;
			}
			if(peso>80.0) {
				acima80++;
			}
						
			
		}
		idade += idade;
		mediaIdade = idade/11;
		
		mediaAltura = alt/11;
		
		
		System.out.println("Dados do TIME 1:");
		System.out.println("Número de jogadores que não possuem 18: " + menores18);
		System.out.println("Média de idade dos jogadores: " + mediaIdade);
		System.out.println("Média de altura dos jogadores: " + mediaAltura);
		System.out.println("Número de jogadores acima dos 80kgs: " + acima80);
		
		sc.close();
		}
	}


