package testes;

public class SegundoTeste {

	public static void main(String[] args) {
		
		float quantidade = Float.valueOf(args[0]);
		
		if(quantidade % 2 == 0){
			System.out.println("Par: " + quantidade);
		} else {
			System.out.println("Impar: " + quantidade);
		}
		
	} 

}