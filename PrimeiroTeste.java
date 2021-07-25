public class PrimeiroTeste {
	
	public static void main(String[] args) {	
		System.out.println("Hello, World");
		System.out.println(args.length);
		
		if(args.length == 6){
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int qteMeses = Integer.valueOf(args[5]);
		
			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qteMeses;

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario mensal: " + salario);
			System.out.println("Recebimentos : " + salarioTotal);
			System.out.println("DevJava: " + java);
		}
		else 
		{
			System.out.println("Deu ruim!");
		}
	}
}