package prova1;

import java.util.Locale;
import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ap, atraso, stotal, sinadi, sfp, classfinal;
		double tm;
		char mc;
		
		// CABECALHO
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		
		// LEITURA VOLUME
		System.out.printf("Quantas comprar o cliente fez no último ano? ");
		ap = sc.nextInt();
		System.out.printf("Qual o ticket médio? ");
		tm = sc.nextDouble();
		
		// LEITURA DOS OUTROS DADOS
		
		System.out.println();
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.printf("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		mc = sc.next().charAt(0);
		System.out.println();
		
		// SCORE DE VOLUME DE COMPRAS
		
		if(tm==0) {
			System.out.println("Score de volume de compras = 0 pontos");
			stotal=0;
		}
		else if(tm>0 && tm<=3000 && ap>2) {
			System.out.println("Score de volume de compras = 40 pontos");
			stotal=40;
		}
		else if(tm>0 && tm<=3000) {
			System.out.println("Score de volume de compras = 20 pontos");
			stotal=20;
		}
		else {
			System.out.println("Score de volume de compras = 60 pontos");
			stotal=60;
		}
		System.out.println();
		
		//SCORES DE INADIMPLENCIA E PAGAMENTOS
		
		if(atraso>1 || ap==0) {
			System.out.println("Score de inadimplência = 0 pontos");
			sinadi=0;
		}
		else if(ap>0 && atraso>=1) {
			System.out.println("Score de inadimplência = 15 pontos");
			sinadi=15;
		}
		else {
			System.out.println("Score de inadimplência = 30 pontos");
			sinadi=30;
		}
		if(ap>0 && mc=='D'){
			System.out.println("Score de forma de pagamento = 5 pontos");
			sfp=5;
		}
		else {
			System.out.println("Score de forma de pagamento = 10 pontos");
			sfp=10;
		}
		System.out.println();
		
		
		
		sc.close();
		
}
}