package tp1;

public class FundamentosDesenvolvimentoJava{

	public static void main(String[] args){		

		int opcao = Integer.valueOf(args[0]);
		if(opcao == 1){
			System.out.println("Registrar as notas de um novo aluno.");
		}
		if(opcao == 2){
			System.out.println("Consultar boletim de um aluno.");
		}
		if(opcao == 3){
			System.out.println("Consultar notas da turma.");
		} 
		if(opcao == 4){
			System.out.println("Sair.");
		}
	}

}
