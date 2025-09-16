package repeticoes;

import java.util.Scanner;

public class Lista3Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;
        int cont = 0;

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero; // soma os múltiplos de 3
                cont++;         // conta quantos foram digitados
            }

        } while (numero != 0); // para quando for digitado 0

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f\n", media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        }

        leia.close();

	}

}
