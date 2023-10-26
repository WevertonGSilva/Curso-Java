package exercicioBanco;

import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		
		/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/
		
		
		
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("Informe o numero da conta a cadastrar: ");
		int numConta = sc.nextInt();
		
		System.out.println("Informe o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Haverá deposito inicial (S/N)");
		char reposta = sc.next().toUpperCase().charAt(0);
		
		if(reposta == 'S') {
			System.out.println("Digite o valor de deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numConta,titular, depositoInicial);
		}else {
			banco = new Banco (numConta, titular);
		}
		
		banco.telaInformacoes();
		
		System.out.println("Deseja realizar um deposito (S/N)? ");
		char resposta = sc.next().toUpperCase().charAt(0);
		
		System.out.println("Digite o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		banco.deposito(valorDeposito);
			
		System.out.println("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		banco.saque(valorSaque);
		
		banco.telaInformacoes();
		
	}
}
