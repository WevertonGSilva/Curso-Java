package exercicioTriangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
				

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf(" A area do triangulo X é: %.4f%n", areaX);
		System.out.printf(" A area do triangulo X é: %.4f%n", areaY);
		
		sc.close();
	}

}
