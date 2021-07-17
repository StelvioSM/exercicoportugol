package ProgramaçãoObjetos;

public class Cliente_main {

	public static void main(String[] args) {
		
		
		//instanciando um obejeto da classe cliente
		
		Cliente samuel = new Cliente ("Samuel","Dois anos","devendo 10 mil reais",21);
		
		//troca de mensagens (chamada ao metodo ImprimirInfo()
														//set/enviar dados/armazenar novos dados
		samuel.imprimirInfo();							//get/buscar dados já salvos
		System.out.println("\nCliente com dividas:");
		samuel.setdivida("\n10 mil reais");
		samuel.imprimirInfo();
		
		Cliente felipe = new Cliente ("Felipe","3 anos","Devendo 15 mil reais",22);
		System.out.println("\nCliente com divida");
		felipe.setdivida("\n10 mil reais");
		felipe.imprimirInfo();
		
		Cliente Jonatas = new Cliente ("jonatas","5 anos","FORNECEDOR:DEVEMOS 40 MIL REAIS",30);
		System.out.println("\nPAGAR FORNECEDOR");
		Jonatas.setdivida("\nNovo fornecedor João");
		Jonatas.imprimirInfo();
		

	}

}
