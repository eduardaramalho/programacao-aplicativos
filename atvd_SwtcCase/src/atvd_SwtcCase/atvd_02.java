package atvd_SwtcCase;

import java.util.Scanner;

public class atvd_02 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        int codProduto, codPais, pesoproduto;
        
        System.out.println("Informe o c�digo do produto:");
        codProduto = sc.nextInt();
        
        switch(codProduto) {
        case 1:
            System.out.println("Pre�o por grama = 10");
            System.out.println("Pre�o total do produto em kg:R$10000");
            break;
        case 2:
            System.out.println("Pre�o por grama = 10");
            System.out.println("Pre�o total do produto em kg:R$10000");
            break;
        case 3:
            System.out.println("Pre�o por grama = 10");
            System.out.println("Pre�o total do produto em kg:R$10000");
            break;
        case 4:
            System.out.println("Pre�o por grama = 10");
            System.out.println("Pre�o total do produto em kg:R$10000");
            break;
        case 5:
            System.out.println("Pre�o por grama = 25");
            System.out.println("Pre�o total do produto em kg:R$25000");
            break;
        case 6:
            System.out.println("Pre�o por grama = 25");
            System.out.println("Pre�o total do produto em kg:R$25000");
            break;
        case 7:
            System.out.println("Pre�o por grama = 25");
            System.out.println("Pre�o total do produto em kg:R$25000");
            break;
        case 8:
            System.out.println("Pre�o por grama = 35");
            System.out.println("Pre�o total do produto em kg:R$35000");
            break;
        case 9:
            System.out.println("Pre�o por grama = 35");
            System.out.println("Pre�o total do produto em kg:R$35000");
            break;
        case 10:
            System.out.println("Pre�o por grama = 35");
            System.out.println("Pre�o total do produto em kg:R$35000");
            break;
        default:
            System.out.println("Codigo invalido!");
        }
        
        System.out.println("Informe peso do produto comprado em Kg");
        pesoproduto = sc.nextInt();
    
        
        System.out.println("Digite o codigo de origem do pais:");
        codPais = sc.nextInt();
        
        switch(codPais) {
        case 1:
            System.out.println("imposto de 0%");
            codPais = 0;
            break;
        case 2:
            System.out.println("Imposto de 15%");
            break;
        case 3:
            System.out.println("Imposto de 25%");
            break;
        default:
            System.out.println("Codigo invalido!");
        }
        
        System.out.println("");
        
        
        
    }

}