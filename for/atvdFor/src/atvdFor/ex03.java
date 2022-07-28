package atvdFor;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

	
		int numOperario, numPecas, sexoOperario;
        double salarioMinimo;
        
           
        System.out.println("Número de peças fabricadas por mês:");
        numPecas = sc.nextInt();
        
        System.out.println("Sexo do operário:");
        sexoOperario = sc.nextInt();
        
        System.out.println("Número do operário:");
        numOperario = sc.nextInt();
        
        switch(numOperario) {
        case 1:
            System.out.println("Salário mínimo:");
            salarioMinimo = sc.nextDouble();
            System.out.println("Salário total: " + salarioMinimo);
            
        case 2:
            System.out.println("Salário mínimo:");
            salarioMinimo = sc.nextDouble();
            double salarioMinimo2 = salarioMinimo*0.03;
            System.out.println("Salário total:"+(salarioMinimo2 + salarioMinimo));
            
        case 3:
            System.out.println("Salário mínimo:");
            salarioMinimo = sc.nextDouble();
            double salarioMinimo3 = salarioMinimo*0.05;
            System.out.println("Salário total:"+(salarioMinimo3 + salarioMinimo));
            
        default:
        	System.out.println("Número errado.");
        }
        

		sc.close();
	}

}
