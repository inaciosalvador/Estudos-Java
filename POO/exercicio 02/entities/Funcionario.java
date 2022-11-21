package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {

		return grossSalary - tax;
		 
	}

	public double increaSalary(double percentage) {

		double newSalary = NetSalary() + ((percentage / 100) * grossSalary); // calculo do salario liq + aumento
		return newSalary;

	}

}
