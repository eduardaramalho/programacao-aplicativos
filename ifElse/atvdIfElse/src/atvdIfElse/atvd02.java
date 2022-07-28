package atvdIfElse;
import java.util.Scanner;
public class atvd02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        int dia, ano, hora, min;
	        String mes;

	        
	        System.out.println("Informe o dia: ");
	        dia = sc.nextInt();
	        
	        System.out.println("Informe o mês por extenso: ");
	        mes = sc.next();
	        
	        System.out.println("Informe o ano: ");
	        ano = sc.nextInt();
	        
	        System.out.println("Informe a hora: ");
	        hora = sc.nextInt();
	        
	        System.out.println("Informe os minutos: ");
	        min = sc.nextInt();
	        
	        System.out.println(dia+"/"+mes+"/"+ano);
	        System.out.println(hora+":"+min);
	        }

	}