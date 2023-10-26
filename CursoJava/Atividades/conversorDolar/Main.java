package conversorDolar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantidade de dolares a comprar: ");
		double qtds= sc.nextDouble();
		
		double c = Converter.Conversor(dolar, qtds);
		System.out.println(c);

		sc.close();
	}

}
