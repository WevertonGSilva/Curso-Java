package exercicioRetangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite o valor da Base do Retangulo: ");
		retangulo.base = sc.nextDouble();
		System.out.println("Digite o valor da Altura do Retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.Area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.Perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.Diagonal());
		
		sc.close();
		
		
	}

}
