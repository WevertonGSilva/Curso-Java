package exercicioNotas;

public class Aluno {
	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	public double NotaFinal() {
		return (trimestre1 + trimestre2 + trimestre3);
	}
	
	public double PontosRestantes() {
		if (NotaFinal() < 60.00) {
			return 60 - NotaFinal();
		}
		else {
			return 0;
		}
	}

}
