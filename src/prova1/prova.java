package prova1;

import java.util.Locale;
import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ap, atraso;
		double tm;
		char mc;
		
		// CABECALHO
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();
		
		// LEITURA VOLUME
		System.out.printf("Quantas comprar o cliente fez no �ltimo ano? ");
		ap = sc.nextInt();
		System.out.printf("Qual o ticket m�dio? ");
		tm = sc.nextDouble();
		
		// LEITURA DOS OUTROS DADOS
		
		System.out.println();
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		mc = sc.next().charAt(0);
		System.out.println();
		
		
		sc.close();
		
}
}