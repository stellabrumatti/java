package condicionais;

import java.util.Scanner;

public class List1ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        String palavra1, palavra2, palavra3;
        
		System.out.print("Digite a 1ª palavra: ");
        palavra1 = leia.nextLine();

        System.out.print("Digite a 2ª palavra: ");
        palavra2 = leia.nextLine();

        System.out.print("Digite a 3ª palavra: ");
        palavra3 = leia.nextLine();

        // Estrutura condicional If encadeada
        
        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Águia");
                } else if (palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Pomba");
                }
            } else if (palavra2.equalsIgnoreCase("mamífero")) {
                if (palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematófago")) {
                    System.out.println("Pulga");
                } else if (palavra3.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Lagarta");
                }
            } else if (palavra2.equalsIgnoreCase("anelídeo")) {
                if (palavra3.equalsIgnoreCase("hematófago")) {
                    System.out.println("Sanguessuga");
                } else if (palavra3.equalsIgnoreCase("onívoro")) {
                    System.out.println("Minhoca");
                }
            }
        } else {
            System.out.println("Combinação inválida!");
        }

        leia.close();	

	}

}
