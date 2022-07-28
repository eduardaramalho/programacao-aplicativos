package atvd02;
import java.util.Scanner;
public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double salarioMinimo, quilowatt, custo, desconto;
        
        System.out.println("Informe o valor do salário mínimo: ");
        salarioMinimo = sc.nextDouble();
        
        System.out.print("Quilowatts: ");
        quilowatt= sc.nextDouble();
        
        custo = salarioMinimo / 5;
        
        System.out.println("O custo de cada quilowatt: " + custo);
        System.out.println("O custo total: " + (custo * quilowatt));
        
        desconto= (custo*quilowatt) * 0.15;
        System.out.println("Desconto: " + ((custo * quilowatt) - desconto));
        

	}

}
