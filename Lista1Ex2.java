package repeticoes;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int pares = 0, impares = 0; 

        // Laço para ler 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();

            // Verifica se é par ou ímpar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Saída dos resultados
        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        leia.close();
	}

}
