public class PrimeiroTeste {
	
	private static boolean validar(int qtde){
		if (qtde == 6){
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {	
		System.out.println("Hello, World");

		//if(args.length == 6){
		if(validar(args.length)){
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int qteMeses = Integer.valueOf(args[5]);
		
			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qteMeses;

			String situacao;

			if(idade < 50){
				situacao = "Iniciante"; 
			} else{
				situacao = "Veterano"; 
			}

			String status;
			if(salarioTotal > 1000){
				status = "Estavel";	
			} else {
				status = "Instavel";
			}
			

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