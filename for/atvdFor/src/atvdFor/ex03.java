package atvdFor;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

	
		int numOperario, numPecas, sexoOperario;
        double salarioMinimo;
        
           
        System.out.println("N�mero de pe�as fabricadas por m�s:");
        numPecas = sc.nextInt();
        
        System.out.println("Sexo do oper�rio:");
        sexoOperario = sc.nextInt();
        
        System.out.println("N�mero do oper�rio:");
        numOperario = sc.nextInt();
        
        switch(numOperario) {
        case 1:
            System.out.println("Sal�rio m�nimo:");
            salarioMinimo = sc.nextDouble();
            System.out.println("Sal�rio total: " + salarioMinimo);
            
        case 2:
            System.out.println("Sal�rio m�nimo:");
            salarioMinimo = sc.nextDouble();
            double salarioMinimo2 = salarioMinimo*0.03;
            System.out.println("Sal�rio total:"+(salarioMinimo2 + salarioMinimo));
            
        case 3:
            System.out.println("Sal�rio m�nimo:");
            salarioMinimo = sc.nextDouble();
            double salarioMinimo3 = salarioMinimo*0.05;
            System.out.println("Sal�rio total:"+(salarioMinimo3 + salarioMinimo));
            
        default:
        	System.out.println("N�mero errado.");
        }
        

		sc.close();
	}

}
