package repeticoes;

import java.util.Scanner;

public class Lista2ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        int idade;
        int menores21 = 0;
        int maiores50 = 0;

        System.out.print("Digite uma idade: ");
        idade = leia.nextInt();

        // Continua até o usuário digitar um número negativo
        while (idade >= 0) {
            if (idade < 21) {
                menores21++;
            } else if (idade > 50) {
                maiores50++;
            }

            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
        }

        // Exibe os resultados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

        leia.close();

	}

}
