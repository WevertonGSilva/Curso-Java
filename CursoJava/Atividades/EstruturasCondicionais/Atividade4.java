package EstruturasCondicionais;
import java.util.Scanner;

public class Atividade4 {
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha invalida, tenta novamente");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta!");

		sc.close();
		
	}

}
