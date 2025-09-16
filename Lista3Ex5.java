package repeticoes;

import java.util.Scanner;

public class Lista3Ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero; // soma apenas os positivos
            }

        } while (numero != 0); // para quando for digitado 0

        System.out.println("\nA soma dos números positivos é: " + soma);

        leia.close();

	}

}
