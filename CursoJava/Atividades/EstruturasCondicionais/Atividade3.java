package EstruturasCondicionais;
import java.util.Scanner;

public class Atividade3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		if (N1%N2 == 0 || N2%N1 == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		sc.close();
	}

}
