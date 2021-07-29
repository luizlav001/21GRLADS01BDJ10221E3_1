public class PrimeiroTeste {
	
	private static String nome;
	private static String sobrenome;
	private static int idade;
	private static float salario;
	private static boolean java;
	private static int qteMeses;
	
	private static boolean validar(int qtde){
		if (qtde == 6){
			return true;
		} else {
			return false;
		}
		
	}

	private static int calcularAnoNascimento(int idade){
		return 2021 - idade;
	}

	private static float calcularSalarioTotal(float salario, int qteMeses){
		return salario * qteMeses;
	}

	private static String definirSituacao(int idade){
		if(idade < 50){
			return "Iniciante";
		}
		return "Veterano";
	}

	private static String definirStatus(float salarioTotal){
		if(salarioTotal > 1000){
			return "Estavel";
		}
		return "Instavel";
	}

	private static void tratarParametros(String[] args){
		nome = args[0];
		sobrenome = args[1];
		idade = Integer.valueOf(args[2]);
		salario = Float.valueOf(args[3]);
		java = Boolean.valueOf(args[4]);
		qteMeses = Integer.valueOf(args[5]);
	}	

	public static void main(String[] args) {	
		System.out.println("Hello, World");

		if(validar(args.length)){

			tratarParametros(args);
			int anoNascimento = calcularAnoNascimento(idade);
			float salarioTotal = calcularSalarioTotal(salario, qteMeses);
			String situacao = definirSituacao(idade);
			String status = definirStatus(salarioTotal);
			

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario mensal: " + salario);
			System.out.println("Recebimentos : " + salarioTotal);
			System.out.println("DevJava: " + java);
			System.out.println("Situacao: " + situacao);
			System.out.println("Status: " + status);
		}
		else 
		{
			System.out.println("Deu ruim!");
		}
	}
}