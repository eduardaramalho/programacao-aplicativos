package atvd02;
import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		int numero1,numero2,numero3,numero4,numero5,soma;
		double divisao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		numero1= sc.nextInt();		
		System.out.println("Informe o segundo número:");
		numero2= sc.nextInt();
		System.out.println("Informe o terceiro número:");
		numero3=sc.nextInt();
		System.out.println("Informe o quarto número:");
		numero4=sc.nextInt();
		System.out.println("Informe o quinto número:");
		numero5=sc.nextInt();
		
		soma = numero1 + numero2+ numero3+numero4+numero5;
		
		System.out.println("A soma entre os cinco números é igual a: " + soma);
		
		divisao = soma/8;
		
		System.out.println("A divisão da soma é igual a: " + divisao);
	}

}
