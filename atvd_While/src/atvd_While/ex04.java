package atvd_While;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 double residencial = 0, comercial = 0, industrial = 0; 
		
		System.out.println("Informe o salário mínimo atual: ");
		double salarioMin = sc.nextDouble();
		
		System.out.println("Tipo de consumidor: "
				+ "\n1 | (Residencial) - 5% de acréscimo"
				+ "\n2 | (Comercial)  - 10% de acréscimo"
				+ "\n3 | (Industrial) - 15% de acréscimo");
		int tipoC = sc.nextInt();
		
		System.out.println("Informe o valor gasto: ");
		
		double q = salarioMin/8;
		System.out.println("Valor do quilowatt: " + q);
		
		switch (tipoC) {
		case 1:
			  residencial = salarioMin*0.05;
		     System.out.println("Valor de acrescimo : R$"+residencial);
		     break;
		case 2: 
			 comercial = salarioMin*0.10;
		     System.out.println("O valor de acrescimo do comercial é: R$"+comercial);
		     break;
		case 3: 
			 industrial = salarioMin*0.15;
	        System.out.println("O valor de acrescimo do industrial é: R$"+industrial);
	        break;
		}
		
       
        double fatGeral = residencial + comercial + industrial;
        System.out.println("Faturamento geral da empresa: R$"+fatGeral);
        
        sc.close();
			
		}
}

