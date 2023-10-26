package exercicioRetangulo;

public class Retangulo {
		
	double base;
	double altura;
	
	public double Area() {
		return base * altura;
	}
	
	public double Perimetro() {
		return 2*(base+altura);
	}
	
	public double Diagonal() {
		return  Math.sqrt(base * base + altura * altura);
	}

}
