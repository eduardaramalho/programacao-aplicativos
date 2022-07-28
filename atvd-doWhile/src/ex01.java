import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, n=0;
		
		do {
			n = 0;
			
			System.out.println("Informe um número:");
			num = sc.nextInt();
			
			if(num<=1) { break;}
			
			for(int i = num; i>=1; i--) {
				if(num%i==0) {
					n++;
				}
			}
			
			if(n==2) {
				System.out.println("Número primo.");
			}else {
				System.out.println("Não é primo.");
			}
			
		}while(num>1);
		
		sc.close();

	}

}
