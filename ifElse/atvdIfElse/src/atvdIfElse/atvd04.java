package atvdIfElse;
import java.util.Scanner;
public class atvd04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicio, minutoInicio, horaTermino, minutoTermino, duracaoHora, duracaoMinuto, duracao;

		System.out.println("Hora de inicio: ");
		horaInicio = sc.nextInt();
		if (horaInicio > 24) {
			System.out.println("Horario inv�lido!");
			System.out.println("Informe novamente o hor�rio de inicio:");
			horaInicio = sc.nextInt();
		}

		System.out.println("Minuto de inicio: ");
		minutoInicio = sc.nextInt();
		if (minutoInicio > 59) {
			System.out.println("minuto invalido!");
			System.out.println("Digite novamente o minuto de inicio:");
			minutoInicio = sc.nextInt();
		}

		System.out.println("Hora do t�rmino: ");
		horaTermino = sc.nextInt();
		if (horaTermino > 24) {
			System.out.println("Horario inv�lido!");
			System.out.println("Digite novamente o horario de t�rmino:");
			horaTermino = sc.nextInt();
		}

		System.out.println("Minuto do t�rmino: ");
		minutoTermino = sc.nextInt();
		if (minutoTermino > 59) {
			System.out.println("Minuto inv�lido!");
			System.out.println("Digite novamente o minuto de termino:");
			minutoTermino = sc.nextInt();
		}

		duracaoHora = (horaInicio + 24) - (horaTermino + 24);
		duracaoMinuto = (minutoInicio + 60) - (minutoTermino + 60);
		System.out.println("A duraca�ao de jogo foi de: " + duracaoHora + ":" + duracaoMinuto);

		sc.close();

	}

}