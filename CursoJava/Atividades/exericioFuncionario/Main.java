package exericioFuncionario;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario emp = new Funcionario();
		System.out.print("Name: ");
		emp.nome = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		emp.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.Aumento(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		} 
		
		
	}
