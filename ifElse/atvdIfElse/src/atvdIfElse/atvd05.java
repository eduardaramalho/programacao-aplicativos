package atvdIfElse;
import java.util.Scanner;
public class atvd05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo;
		float salarioAtual = 0;

		System.out.println("|--------|-------------|---------------|");
		System.out.println("| Codigo | Cargo       |Percentual     |");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("| 1      | Escritur�rio|50%            |");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("| 2      | Secret�rio  |35%            |");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("| 3      | Caixa       |20%            |");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("| 4      | Gerente     |10%            |");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("| 5      | Diretor     |N�o tem aumento|");
		System.out.println("|--------|-------------|---------------|");
		System.out.println("Digite seu codigo de cargo:");
		codigo = sc.nextInt();
		while (codigo > 5 || codigo < 1) {
			System.out.println("Insira um c�digo de 1 a 5.");
			System.out.println("Digite um codigo de cargo novamente:");
			codigo = sc.nextInt();
		}

		if (codigo == 1) {
			System.out.println("Digite seu sal�rio atual:");
			salarioAtual = sc.nextFloat();

			double novoSalario1 = salarioAtual * 0.5;
			System.out.println("Novo sal�rio:" + (novoSalario1 + salarioAtual));
		} else if (codigo == 2) {
			System.out.println("Digite seu sal�rio atual:");
			salarioAtual = sc.nextFloat();
			double novoSalario2 = salarioAtual * 0.35;

			System.out.println("Novo sal�rio:" + (novoSalario2 + salarioAtual));
		} else if (codigo == 3) {
			System.out.println("Digite seu sal�rio atual:");
			salarioAtual = sc.nextFloat();
			double novoSalario3 = salarioAtual * 0.2;

			System.out.println("Novo sal�rio:" + (novoSalario3 + salarioAtual));
		} else if (codigo == 4) {
			System.out.println("Digite seu sal�rio atual:");
			salarioAtual = sc.nextFloat();
			double novoSalario4 = salarioAtual * 0.1;

			System.out.println("Novo sal�rio:" + (novoSalario4 + salarioAtual));
		} else if (codigo == 5) {
			System.out.println("Digite seu salario atual:");
			salarioAtual = sc.nextFloat();

			System.out.println("Novo sal�rio:" + salarioAtual);
			System.out.println("N�o teve aumento do seu sal�rio");
		}

	}

}