package atvd_SwtcCase;

import java.util.Scanner;

public class atvd_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int formatoPagamento;
		double valorCompra;
		
		System.out.println("Informe o formato de parcelamento: "
				+ "\n1 - Pagamento � vista com 15% de desconto."
				+ "\n2 - Pagamento com cheque pr�-datado para 30 dias - 10% de desconto."
				+ "\n3 - Pagamento parcelado em 6 vezes - n�o tem desconto."
				+ "\n4 - Pagamento parcelado em 12 vezes - 8% de acr�scimo. ");
		formatoPagamento = sc.nextInt();
		
		switch (formatoPagamento) {
		case 1: 
			System.out.println("Pagamento � vista com 15% de desconto.");
			System.out.println("Informe o valor da compra: ");
			valorCompra = sc.nextDouble();
			System.out.println("Valor total com desconto: " + (valorCompra*0.15 - valorCompra));
			break;
		case 2:
			System.out.println("Pagamento com cheque pr�-datado para 30 dias - 10% de desconto.");
			System.out.println("Informe o valor da compra: ");
			valorCompra = sc.nextDouble();
			System.out.println("Valor total com desconto: " + (valorCompra*0.1 - valorCompra));
			break;
		case 3:
			System.out.println("Pagamento parcelado em 6 vezes - n�o tem desconto.");
			System.out.println("Informe o valor da compra: ");
			valorCompra = sc.nextDouble();
			System.out.println("Sem desconto. Valor total: " + valorCompra);
			System.out.println("Valor da parcela: " + (valorCompra/6));
			break;
		case 4:
			System.out.println("Pagamento parcelado em 12 vezes - 8% de acr�scimo.");
			System.out.println("Informe o valor da compra: ");
			valorCompra = sc.nextDouble();
			System.out.println("Valor total com acr�scimo: " + (valorCompra*0.08 + valorCompra));
			System.out.println("Valor da parcela: " + (valorCompra*0.08 + valorCompra)/12 );
			break;
		}
		
	}

}
