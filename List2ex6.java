package condicionais;

import java.util.Scanner;

public class List2ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 String nome, cargo = "";
	        int codigo;
	        float salario, novoSalario;
	        float percentual = 0.0f;
	        
	        System.out.print("Nome do colaborador: ");
	        nome = leia.nextLine();

	        System.out.print("Código do Cargo: ");
	        codigo = leia.nextInt();

	        System.out.print("Salário: R$ ");
	        salario = leia.nextFloat();
	        
	        switch (codigo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
	        }
                novoSalario = salario + (percentual * salario);
                
                System.out.println("\nNome do colaborador: " + nome);
                System.out.println("Cargo: " + cargo);
                System.out.printf("Salário: R$ %.2f\n", novoSalario);

                leia.close();

	}

}
