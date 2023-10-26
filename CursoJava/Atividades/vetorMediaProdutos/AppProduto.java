package vetorMediaProdutos;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos a serem cadastrados: ");
		int n = sc.nextInt();
		Produto[] vet = new Produto[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			System.out.println("Digite o preco do produto: ");
			double preco = sc.nextDouble();
			vet[i] = new Produto(nome,preco);
			
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += vet[i].getPreco();
		}
		
		System.out.println("Produtos Cadastrados: "+n);
		
		double media = soma / n;
		System.out.println("Preco Medio: "+media);
		
		sc.close();
		

	}

}
