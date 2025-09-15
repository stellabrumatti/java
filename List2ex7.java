package condicionais;

import java.util.Scanner;

public class List2ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        float numero1, numero2, resultado = 0;
        int operacao;

      
        System.out.print("Digite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        numero2 = leia.nextFloat();

        System.out.print("Operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        operacao = leia.nextInt();

        
        switch (operacao) {
            case 1: // Soma
                resultado = numero1 + numero2;
                System.out.println("\n" + numero1 + " + " + numero2 + " = " + resultado);
                break;
            case 2: // Subtração
                resultado = numero1 - numero2;
                System.out.println("\n" + numero1 + " - " + numero2 + " = " + resultado);
                break;
            case 3: // Multiplicação
                resultado = numero1 * numero2;
                System.out.println("\n" + numero1 + " * " + numero2 + " = " + resultado);
                break;
            case 4: // Divisão
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("\n" + numero1 + " / " + numero2 + " = " + resultado);
                } else {
                    System.out.println("\nErro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("\nOperação Inválida!");
                break;
        }

        leia.close();

	}

}
