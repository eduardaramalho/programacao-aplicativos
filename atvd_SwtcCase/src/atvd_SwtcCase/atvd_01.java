package atvd_SwtcCase;
import java.util.Scanner;
public class atvd_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioAtual=0;
		
		System.out.print("Informe o código do seu cargo:");
		int codigo = sc.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Cargo: Escriturário.");
			System.out.println("Informe o seu salário atual: ");
			salarioAtual = sc.nextDouble();
			System.out.println("Novo salário: " + (salarioAtual*0.50+salarioAtual) );
			break;
		case 2:
			System.out.println("Cargo: Secretário.");
			System.out.println("Informe o seu salário atual: ");
			salarioAtual = sc.nextDouble();
			System.out.println("Novo salário: " + (salarioAtual*0.35+salarioAtual) );
			break;
		case 3:
			System.out.println("Cargo: Caixa.");
			System.out.println("Informe o seu salário atual: ");
			salarioAtual = sc.nextDouble();
			System.out.println("Novo salário: " + (salarioAtual*0.20+salarioAtual) );
			break;
		case 4:
			System.out.println("Cargo: Gerente.");
			System.out.println("Informe o seu salário atual: ");
			salarioAtual = sc.nextDouble();
			System.out.println("Novo salário: " + (salarioAtual*0.10+salarioAtual) );
			break;
		case 5:
			System.out.println("Sem aumento");
			break;
		default:
			System.out.println("Código inválido. Digite de 1 a 5.");
		}

	}

}
