import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int codigoCidade, veiculoPasseio=0, vitimaAcidente=0, i=0, media=0;
		
		do {
			System.out.println("C�digo da cidade: ");
			codigoCidade = sc.nextInt();
			
			System.out.println("N�mero de ve�culos de passeio: ");
			veiculoPasseio = sc.nextInt();
			
			System.out.println("N�mero de acidentes com v�timas: ");
			vitimaAcidente = sc.nextInt();
			
			media+=vitimaAcidente;
			
			if(codigoCidade>vitimaAcidente) {
				System.out.println("Cidade do c�digo " + codigoCidade + " obteve o maior indice de acidente.");

			}
			
			System.out.println("A m�dia de ve�culos das 5 cidades foi de: " + media/5);
			
			if(media < 2000) {
				System.out.println("A m�dia de acidentes de tr�nsito foi de: " + media/5);
			}
			
			i++;
			
		}while(i<=5);
		
		
		sc.close();
	}

}
