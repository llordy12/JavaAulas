package operadoes;

public class Unarios {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 8;
		
		System.out.println("\n Pré Incrementar: x = ++ y");
		
		x = y++; 
		 
		System.out.println("\nValor de x: " + x);

		System.out.println("\nValor de x: " + y);
		
		System.out.println("\n Pós Incrementar: x = ++ y");
		x = ++y; 
		
		System.out.println("\nValor de x: " + x);

		System.out.println("\nValor de x: " + y);
		
		
	}

}
