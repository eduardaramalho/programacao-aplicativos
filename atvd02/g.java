package atvd02;
import java.util.Scanner;
public class g {

	public static void main(String[] args) {
	int tabuada,num;
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Informe a tabela desejado:");
	tabuada = sc.nextInt();
	
	 for(num=0;num<=10;num++) {
         System.out.println(tabuada+"X"+num+"="+tabuada*num);
     }
}
}
