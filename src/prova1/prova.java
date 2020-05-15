package prova1;

import java.util.Locale;
import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ap;
		double tm;
		
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
		
		
		sc.close();
		
}
}