package Programa��oObjetos;

public class Aviao_main {

	public static void main(String[] args) {
		
		
		//criando um objeto na classe avi�o
		
		
		//troca de mensagens chamada da fun�ao ImprimirInfo()
		
		//set armazena dados ou atualiza dados
		//get=busca dados 
		
	/*1=objeto */
		Aviao airbus270 = new Aviao("Embraer","airbus270","Ana Patricia","26374338494");
		airbus270.imprimirinfo();
		System.out.println("\nPermiss�o de v�o:");
		airbus270.setNumeracao("\n77777777");
		airbus270.imprimirinfo();
	/*2=objeto */
		
		Aviao boeing274 =new Aviao("Boeing 274","Boeing","Stelvio","74637338384");
		boeing274.imprimirinfo();
		System.out.println("\nPermiss�o de V�o:");
		boeing274.setMarca("\nNave da Tesla");
		boeing274.imprimirinfo();
		
	/*3=objeto */
		
		Aviao bis14=new Aviao("Santos Drummon","Bis 14","Felipe","77777777");
		bis14.imprimirinfo();
		System.out.println("\nPermiss�o de V�o");
		bis14.setMarca("\n CA�A F16");
		bis14.setModelo("\n CA�A F16");
		bis14.imprimirinfo();
		
		
		
		
		
		
	}

}
