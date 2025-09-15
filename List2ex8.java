package condicionais;

import java.util.Scanner;

public class List2ex8 {

	public static void main(String[] args) {
		  Scanner leia = new Scanner(System.in);

	        float saldo = 1000.00f; // Saldo inicial
	        int operacao;
	        float valor;

	        // Entrada da operação
	        System.out.print("Operação (1-Saldo, 2-Saque, 3-Depósito): ");
	        operacao = leia.nextInt();

	        switch (operacao) {
	            case 1: // Saldo
	                System.out.println("\nOperação - Saldo");
	                System.out.printf("Saldo: R$ %.2f\n", saldo);
	                break;

	            case 2: // Saque
	                System.out.print("Valor: R$ ");
	                valor = leia.nextFloat();

	                System.out.println("\nOperação - Saque");
	                if (valor <= saldo) {
	                    saldo -= valor;
	                    System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
	                } else {
	                    System.out.println("Saldo Insuficiente!");
	                }
	                break;

	            case 3: 
	                System.out.print("Valor: R$ ");
	                valor = leia.nextFloat();

	                saldo += valor;
	                System.out.println("\nOperação - Depósito");
	                System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
	                break;

	            default: 
	                System.out.println("\nOperação Inválida!");
	                break;
	        }

	      leia.close();

	}

}
