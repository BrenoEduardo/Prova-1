package prova1;

import java.util.Locale;
import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ap;
		double tm;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		System.out.printf("Quantas vezes o cliente atrasou o pagamento? ");
		ap = sc.nextInt();
		System.out.printf("Qual o ticket médio? ");
		tm = sc.nextDouble();
		
		
		
		sc.close();
		
}
}