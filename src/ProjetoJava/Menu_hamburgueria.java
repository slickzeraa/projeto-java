package ProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;

public class Menu_hamburgueria {
    public static void main(String[] args) {

    	ContaController contas = new ContaController();
    	
        Scanner leia = new Scanner(System.in);
        
        String cliente;
        int  tipo=0, qtnd;
        float preco = 0, valorTotal;
		

		while(true) {

			System.out.println( "***************************************************************");
			System.out.println("                                                                ");
			System.out.println("                     ASSISTÊNCIA TÉCNICA YURI                   ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                 TABELA DE PREÇOS                               ");
			System.out.println("            1 - Formatação: R$ 120,00                           ");
			System.out.println("            2 - Troca de pasta térmica: R$ 80,00                ");
			System.out.println("            3 - Instalar softaware: R$ 75,00                    ");
			System.out.println("            4 - Troca de ssd/memória ou processador: R$ 200,00  ");
			System.out.println("            5 - PC GAMER: R$ 5.000,00                           ");
			System.out.println("            6 - Consultoria: R$ 100,00                          ");
			System.out.println("            7 - Sair                                            ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                ");

			try {
				tipo = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				tipo = 0;
			}

			if (tipo == 7) {
				System.out.println("\nAssistência técnica Yuri - Os melhores preços da Região!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (tipo) {
				case 1:
					System.out.println("Preço formatação: R$120,00");
					preco = 120;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantas formatações quer por no carrinho??");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
				
					
                    		break;
				case 2:
					System.out.println("Preço Troca de pasta térmica: R$ 80,00 ");
					preco = 80;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantas trocas de pasta térmica quer por no carrinho??");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                    		break;
				case 3:
					System.out.println("Preço instalações de software: R$ 75,00 ");
					preco = 75;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantas instalações de software quer por no carrinho??");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                    		break;
				case 4:
					System.out.println("Preço tocas de peças (ssd/memória ou processador): R$ 200,00 ");
					preco = 200;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantas tocas de peças (ssd/memória ou processador) quer por no carrinho??");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                    		break;
				case 5:
					System.out.println("Preço PC GAMER: R$ 5.000,00 ");
					preco = 5000;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantos PC GAMERs quer por no carrinho?");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                   	 	break;
				case 6:
					System.out.println("Preço consultoria: R$ 100,00 ");
					preco = 100;
					System.out.println("\nNome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					System.out.println("\nQuantas consultorias quer por no carrinho?");
					qtnd = leia.nextInt();
					valorTotal = contas.cobrar(qtnd, preco);
					System.out.println("Valor do seu carrinho: R$ " + valorTotal);
                   	 	break;
				default:
					System.out.println("\nOpção Inválida!\n");
                    		break;
			}
		}	
    }

    public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Yuri Henrick");
		System.out.println("E-mail - yuri_henrick@hotmail.com");
		System.out.println("github.com/slickzeraa");
		System.out.println("*********************************************************");
	}

}