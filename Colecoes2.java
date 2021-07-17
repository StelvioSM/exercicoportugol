package Smith;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
       
		/* Crie um programa para trabalhar com estoque de uma loja, o programa dever�
     trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
     programa dever� atender as seguintes funcionalidades:
     Armazenar dados da List
     Remover dados da list;
     Atualizar dados da list.
     Apresentar todos os dados da list.*/
	 
	int op; 
	Scanner leia = new Scanner(System.in); 
		
	ArrayList<String> estoque = new ArrayList();
			
		
	  do {
			System.out.println
				       ("\n(1) Deseja adicionar produtos ao estoque\n"+"(2) Deseja remover um produto? \n(3)atualizar\n(4)Mostrar todos os produtos do estoque"+"\n(0) Encerrar o programa ");
			
			System.out.println("\n-----------------------------------------");
			System.out.println("\n\t\tDigite sua op��o: ");
			System.out.println("\n-----------------------------------------");
			op = leia.nextInt();

			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto n�o existe no estoque...");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrar� no lugar de "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existente...");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa... Volte sempre...");
				
			}
			
		}
		while(op!=0);
	}
	
}




	
	
	

