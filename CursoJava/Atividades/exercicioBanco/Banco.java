package exercicioBanco;

public class Banco {
	
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Banco(int numConta, String nomeTitular, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	

	public Banco(int numConta, String nomeTitular) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}



	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "numConta "
				+ numConta
				+ ", nomeTitular: "
				+ nomeTitular
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
	public void telaInformacoes() {
		System.out.println();
		System.out.println("Dados da Conta ");
		System.out.println("Numero da Conta: "+numConta);
		System.out.println("Nome do titular: "+nomeTitular);
		System.out.println("Saldo: "+saldo);
	}

	public void deposito(double qtd) {
		saldo += qtd;
		
	}
	
	public void saque (double qtd) {
		saldo -= qtd + 5.00;
	}
	

}
