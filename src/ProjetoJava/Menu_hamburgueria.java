package ProjetoJava;

import java.util.Scanner;


public class Menu_hamburgueria {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

		int opcao, produto;

		while(true) {

			System.out.println( "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 HAMBURGUERIA DO YURI                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                       MENU                          ");
			System.out.println("            1 - X-Burguer                            ");
			System.out.println("            2 - X-Salada                             ");
			System.out.println("            3 - X-Bacon                              ");
			System.out.println("            4 - X-Egg                                ");
			System.out.println("            5 - X-Tudo                               ");
			System.out.println("            6 - Bebidas                              ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nHamburgueria do Yuri - Os melhores lanches da Região!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("\nQuantos X-Burguer?");
					produto = leia.nextInt();
                    		break;
				case 2:
					System.out.println("\nQuantos X-Salada?");
					produto = leia.nextInt();
                    		break;
				case 3:
					System.out.println("\nQuantos X-Bacon?");
					produto = leia.nextInt();
                    		break;
				case 4:
					System.out.println("\nQuantos X-Egg?");
					produto = leia.nextInt();
                    		break;
				case 5:
					System.out.println("\nQuantos X-Tudo?");
					produto = leia.nextInt();
                   	 	break;
				case 6:
					System.out.println("\nQuantas Bebidas?");
					produto = leia.nextInt();
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