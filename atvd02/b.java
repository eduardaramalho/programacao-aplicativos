package atvd02;
import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		int numero1,numero2,numero3,numero4,numero5,soma;
		double divisao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		numero1= sc.nextInt();		
		System.out.println("Informe o segundo n�mero:");
		numero2= sc.nextInt();
		System.out.println("Informe o terceiro n�mero:");
		numero3=sc.nextInt();
		System.out.println("Informe o quarto n�mero:");
		numero4=sc.nextInt();
		System.out.println("Informe o quinto n�mero:");
		numero5=sc.nextInt();
		
		soma = numero1 + numero2+ numero3+numero4+numero5;
		
		System.out.println("A soma entre os cinco n�meros � igual a: " + soma);
		
		divisao = soma/8;
		
		System.out.println("A divis�o da soma � igual a: " + divisao);
	}

}
