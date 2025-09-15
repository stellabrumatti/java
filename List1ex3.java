package condicionais;

import java.util.Scanner;

public class List1ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.print("Digite o Nome do doador: ");
        nome = leia.nextLine();

        System.out.print("Digite a Idade do doador: ");
        idade = leia.nextInt();

        System.out.print("Primeira doação de sangue? (true/false): ");
        primeiraDoacao = leia.nextBoolean();
        
        boolean apto = false;
        
        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69) {
                if (!primeiraDoacao) {
                    apto = true;
                }
            } else {
                apto = true;
            }
        }
        
        if (apto) {
            System.out.println("\n" + nome + " está apto para doar sangue!");
        } else {
            System.out.println("\n" + nome + " não está apto para doar sangue!");
        }

        leia.close();
		
		
		
		
	}

}
