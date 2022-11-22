package entities;

public class Students {

	public String nome;
	public double n1;
	public double n2;
	public double n3;

	public double finalGrade() {

		return n1 + n2 + n3;

	}

	public String toString() {

		if (this.finalGrade() > 60) {

			return "FINAL GRADE: " + finalGrade() + "\nPASS";

		} else {

			return "FINAL GRADE: " + finalGrade() + "\nFAILED \nMISSING: " + (60 - finalGrade() + " POINTS");

		}

	}

}
