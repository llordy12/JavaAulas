package lascosconsdicionais;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
		opcao = leia.nextInt();
		
		switch (opcao) {
		
		
		case 1:
			
			System.out.println("Digite o nome do seu ANIME FAVORITO: ");
			nome = leia.nextLine().toUpperCase();
			
			if(nome.equals("ONE PIECE")) {
				System.out.println("ESSE ANIME É O MELHOR");
			}else {
				System.out.println("não é tao bom mas beleza seja feliz ");
			}
			
			break;
		case 2:
			System.out.println("Frase motivacional: não desista do curso da gen");
			break;
		case 3:
			System.out.println("Indicação de Musica: só preciso de dinheiro pra comprar o me ");
			
			default:
			System.out.println("Opção invalida");
			break;
		}
		
		
	}

}
