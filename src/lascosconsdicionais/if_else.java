package lascosconsdicionais;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		float nota1, nota2, media;
		
		
		System.out.println();
		nota1 = escreva.nextFloat();
		
		System.out.println();
		nota2 = escreva.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media>5) {
			System.out.println("Voce foi aprovado! :D " +" sua media é: " + media);
			
		}else {
			System.out.println("Voce foi reprovado! :C "+ " sua media é: " + media);
		}
	}
}