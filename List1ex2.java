package condicionais;

import java.util.Scanner;

public class List1ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		boolean par = (numero % 2 == 0);
		
		boolean positivo = (numero >= 0);
		
		if(par && positivo) {
			System.out.println("O Numero" + numero +  "é par e positivo");
		} else if(par && !positivo) {
			System.out.println("O Numero" + numero +  "é par e negativo");
		} else if (!par && positivo){
			System.out.println("O Numero" + numero +  "é ímpar e positivo");
		} else {
			System.out.println("O Numero" + numero +  "é ímpar e negativo");
		}
		
		leia.close();	
	}

}
