package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 0;
		int contador;
		
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();
		
		do {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
			contador++;
			
			
		}while(opcao <= 10);
		
		
		leia.close();

	}

}
