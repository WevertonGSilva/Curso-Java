package exercicioNotas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("DIGITE A PRIMEIRA NOTA: ");
		aluno.trimestre1 = sc.nextDouble();
		
		System.out.println("DIGITE A SEGUNDA NOTA: ");
		aluno.trimestre2 = sc.nextDouble();
		
		System.out.println("DIGITE A TERCEIRA NOTA: ");
		aluno.trimestre3 = sc.nextDouble();
		
		System.out.printf("A NOTA FINAL DO ALUNO E: %.2f%n", aluno.NotaFinal());
		
		if (aluno.NotaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("Pontos Restantes: %.2f PONTOS%n", aluno.PontosRestantes());
		}
		else {
			System.out.println("Aprovado");
		}
		sc.close();

	}

}
