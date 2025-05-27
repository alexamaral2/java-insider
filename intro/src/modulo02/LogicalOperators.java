package modulo02;

public class LogicalOperators {

	public static void main(String[] args) {

		int idade = 15;
		String categoria;

		if (idade > 0 && idade <= 12) {
			categoria = "CRIANÇA";
		} else if (idade > 12 && idade <= 18) {
			categoria = "ADOLESCENTE";
		} else if (idade > 18) {
			categoria = "ADULTO";
		} else {
			categoria = "DESCONHECIDO";
		}

		System.out.println("Categoria para " + idade + " anos: " + categoria);
	}

}
