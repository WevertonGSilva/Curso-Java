package EstruturasCondicionais;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		sc.close();
	}

}
