package repeticoes;

import java.util.Scanner;

public class Lista2Ex4 {

	public static void main(String[] args) {
		
		  Scanner leia= new Scanner(System.in);

	        // Contadores
	        int backend = 0;
	        int mulheresFrontend = 0;
	        int homensMobileMais40 = 0;
	        int nbFullstackMenos30 = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;

	        String continuar = "S";

	        while (continuar.equalsIgnoreCase("S")) {
	            
	            // Entrada de dados
	            System.out.print("Idade: ");
	            int idade = leia.nextInt();

	            System.out.print("Identidade de Gênero (1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros): ");
	            int genero = leia.nextInt();

	            System.out.print("Pessoa Desenvolvedora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
	            int dev = leia.nextInt();

	            // Atualiza contadores
	            if (dev == 1) {
	                backend++;
	            }

	            if ((genero == 1 || genero == 4) && dev == 2) {
	                mulheresFrontend++;
	            }

	            if ((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
	                homensMobileMais40++;
	            }

	            if (genero == 3 && dev == 4 && idade < 30) {
	                nbFullstackMenos30++;
	            }

	            totalPessoas++;
	            somaIdades += idade;

	            // Perguntar se deseja continuar
	            System.out.print("\nDeseja continuar (S/N): ");
	            continuar =leia.next();
	            System.out.println();
	        }

	        // Calcula média de idade
	        double mediaIdade = (totalPessoas > 0) ? (double) somaIdades / totalPessoas : 0;

	        // Saída dos resultados
	        System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
	        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
	        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileMais40);
	        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFullstackMenos30);
	        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);

	      leia.close();

	}

}
