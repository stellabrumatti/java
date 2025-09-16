package repeticoes;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número do intervalo: ");
        int inicio = leia.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int fim = leia.nextInt();

        // Validação do intervalo
        if (inicio >= fim) {
            System.out.println("\nIntervalo inválido!");
        } else {
            System.out.println("\nNo Intervalo entre " + inicio + " e " + fim + ":");

            // Laço for para percorrer o intervalo
            for (int i = inicio; i <= fim; i++) {
                if (i % 3 == 0 && i % 5 == 0) { // múltiplos de 3 e 5
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }

        leia.close();

	}

}
