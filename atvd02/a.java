package atvd02;
import java.util.Scanner;
public class a {

	public static void main(String[] args) {
		double numero1,numero2,multiplicacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero decimal:");
		numero1 = sc.nextDouble();
		
		System.out.println("Informe o segundo n�mero decimal:");
		numero2 = sc.nextDouble();
		
		multiplicacao = numero1 * numero2;
		
		System.out.println("Multipli��o de n�mero 1 - " + numero1 + " X n�mero 2 - " + numero2 + " igual a: "  + multiplicacao);

	}

}
