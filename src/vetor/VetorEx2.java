package vetor;

import java.util.Scanner;

public class VetorEx2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int VetorInteiros[] = new int[5]; 
		
		for(int i = 0; i < VetorInteiros.length; i++) {
			System.out.println("Digite o "+ (i+1) +"º numero: ");
			VetorInteiros[i] = scanner.nextInt();		
	}
		for(int i = 0; i < VetorInteiros.length; i++) {
			System.out.println((i+1)+ "º elemento: " + VetorInteiros[i]);
		
	}
	
		System.out.println("Tamanho do vetor: " + VetorInteiros.length);
	}

}
