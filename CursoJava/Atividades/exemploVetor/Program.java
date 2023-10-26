package exemploVetor;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/* Instancia o vetor e aloca o numero de elementos N*/
		double[] vetor = new double[n];
		
		for (int i = 0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		
		
		sc.close();
	}

}
