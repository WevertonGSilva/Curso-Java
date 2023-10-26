package EstruturasCondicionais;
import java.util.Scanner;

public class Atividade6 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int n=1; n<=num; n++) {
			
			if(n%2 !=0) {
				System.out.println(n);
			}
			
		}
		sc.close();
	}

}
