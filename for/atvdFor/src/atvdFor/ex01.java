package atvdFor;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número: ");
		int num = sc.nextInt();
		
		for (int x=0; x<=10; x++) {
			System.out.println(num + "X" + x + "=" + (num*x));
		}
		
		sc.close();
	}

}
