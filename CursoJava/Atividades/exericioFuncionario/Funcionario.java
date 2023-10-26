package exericioFuncionario;

public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", SalarioLiquido());
		}
	
	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void Aumento(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem /100.0;
	}

}
