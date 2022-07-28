package atvd_While;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int entrada=1;
		
		while (entrada>0) {
			
			System.out.println("Informe o número: ");
			entrada = sc.nextInt();
			
			if (entrada>0) {
				System.out.println("Quadrado: " + Math.pow(2, entrada));
				System.out.println("Cubo: " + entrada*entrada*entrada);
				System.out.println("Raíz quadrada: " + Math.sqrt(entrada));	
			}
			
		}
		sc.close();
	}

}
