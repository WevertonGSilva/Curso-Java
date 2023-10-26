package exercicioVetor03;

import java.util.Scanner;

public class AppMediaAltura {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de pessoas a serem cadastradas: ");
		int n = sc. nextInt();
		
		Pessoa[] vet = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			
			vet[i] = new Pessoa(nome,idade,altura);
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vet[i].getAltura();
		}
		
		double mediaAltura =  soma / n;
		System.out.println("Media de altura: " + mediaAltura);
		
		for (int i = 0;i<vet.length;i++) {
			if (vet[i] != null) {
				System.out.println("Cadastro: " + vet[i].getNome() );
			}
		}
	}

}
