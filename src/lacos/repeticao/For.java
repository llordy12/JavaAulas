package lacos.repeticao;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {
    		
    	int numero, i;
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	System.out.println("Digite o numero desejado");
    	numero = scanner.nextInt();
    	
    	for(i = 1;i <=10; i++) {
    		
    		System.out.println(numero + " x " + i + " = " + numero * i);
    	}

    }
}


