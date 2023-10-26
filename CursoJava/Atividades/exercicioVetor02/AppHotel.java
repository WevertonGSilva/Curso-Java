package exercicioVetor02;

import java.util.Scanner;

public class AppHotel {
	
	public static void main (String[] args) {
	/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/
	
	
	Scanner sc = new Scanner(System.in);
	Hotel[] vet = new Hotel[10];
	
	System.out.println("Digite o numero de estudantes a alugar quartos: ");
	int n = sc.nextInt();
	
	for (int i=1; i<=n; i++) {
		System.out.println();
		System.out.println("Aluguel #" + i + ":");
		sc.nextLine();
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Quarto: ");
		int quarto = sc.nextInt();
		vet[quarto] = new Hotel(nome,email);
	}

	System.out.println();
	System.out.println("Quartos Ocupados: ");
	for (int i=0;i<vet.length;i++) {
		if (vet[i] != null) {
			System.out.println(i + ": " + vet[i]);
			}
		}
	sc.close();
	}
}
