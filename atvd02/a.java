package atvd02;
import java.util.Scanner;
public class a {

	public static void main(String[] args) {
		double numero1,numero2,multiplicacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número decimal:");
		numero1 = sc.nextDouble();
		
		System.out.println("Informe o segundo número decimal:");
		numero2 = sc.nextDouble();
		
		multiplicacao = numero1 * numero2;
		
		System.out.println("Multiplição de número 1 - " + numero1 + " X número 2 - " + numero2 + " igual a: "  + multiplicacao);

	}

}
