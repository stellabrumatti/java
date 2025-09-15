package condicionais;

import java.util.Scanner;

public class List2ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo, quantidade;
		String produto = "";
		double preco = 0.0, valorTotal;
		
		System.out.println("===========================================");
		System.out.println("                    Cardápio               ");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.println("               1 - Cachorro Quente          ");
		System.out.println("               2 - X-Salada                 ");
		System.out.println("               3 - X-Bacon                  ");
		System.out.println("               4 - Bauru                  	");
		System.out.println("               5 - Refrigerante             ");
		System.out.println("               6 - Suco de Laranja           ");
		System.out.println("============================================");
		System.out.println("Digite a opção desejada:                    ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade:                        ");
		quantidade = leia.nextInt();

		
		switch (codigo){


					
			case 1:
				produto = "Cachorro Quente";
				preco = 10.00;
				break;	
			case 2:
				produto = "X-Salada";
				preco = 15.00;
				break;	
			case 3:
				produto = "X-Bacon";
				preco = 18.00;
				break;
			case 4:
				produto = "Bauru ";
				preco = 12.00;
				break;
			case 5:
				produto = "Refrigerante ";
				preco = 8.00;
				break;
			case 6:
				produto = "Suco de Laranja ";
				preco = 13.00;
				break;

	default:
		System.out.println("Opção Invalida");
}

			
			
			valorTotal = quantidade * preco;
			
			
			System.out.println("\nProduto: " + produto);
	        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
			
			leia.close();
	}

}
