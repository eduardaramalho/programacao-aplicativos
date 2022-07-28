package atvdIfElse;
import java.util.Scanner;
public class atvd03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dia1, mes1, ano1;
		int dia2, mes2, ano2;

		System.out.println("Informe a primeira data.");
		System.out.print("Informe o dia: ");
		dia1 = sc.nextInt();

		System.out.print("Informe o mês: ");
		mes1 = sc.nextInt();

		System.out.print("Informe o ano: ");
		ano1 = sc.nextInt();

		System.out.print("Informe a segunda data.");
		System.out.println("Informe o dia: ");
		dia2 = sc.nextInt();

		System.out.print("Informe o mês: ");
		mes2 = sc.nextInt();

		System.out.print("Informe o ano: ");
		ano2 = sc.nextInt();

		if (dia1 > dia2 && mes1 == mes2 && ano1 == ano2 || dia1 == dia2 && mes1 > mes2 && ano1 == ano2
				|| dia1 == dia2 && mes1 == mes2 && ano1 > ano2) {
			System.out.println("Primeira data é maior");
			System.out.println(dia1 + "/" + mes1 + "/" + ano1);
		} else {
			System.out.println("Segunda data é maior");
			System.out.println(dia2 + "/" + mes2 + "/" + ano2);
		}

		sc.close();
	}
}