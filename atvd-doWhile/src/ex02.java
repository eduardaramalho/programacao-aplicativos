import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigoCidade, veiculoPasseio=0, vitimaAcidente=0, i=0, media=0;
		
		do {
			System.out.println("Código da cidade: ");
			codigoCidade = sc.nextInt();
			
			System.out.println("Número de veículos de passeio: ");
			veiculoPasseio = sc.nextInt();
			
			System.out.println("Número de acidentes com vítimas: ");
			vitimaAcidente = sc.nextInt();
			
			media+=vitimaAcidente;
			
			if(codigoCidade>vitimaAcidente) {
				System.out.println("Cidade do código " + codigoCidade + " obteve o maior indice de acidente.");

			}
			
			System.out.println("A média de veículos das 5 cidades foi de: " + media/5);
			
			if(media < 2000) {
				System.out.println("A média de acidentes de trânsito foi de: " + media/5);
			}
			
			i++;
			
		}while(i<=5);
		
		
		sc.close();
	}

}
