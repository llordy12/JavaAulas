package variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); // lalal 
		
		int idade; 
		String nome;
		
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Entre com o seu nome: ");
		ler.skip("\\R?");
		nome = ler.nextLine();
		
		System.out.println(" sua idade é:  " + idade + " e " + " seu nome é:  " + nome);
		
		
		

	}

}
