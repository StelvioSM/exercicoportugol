package Teste1;

public class Cachorro extends Animal {
     
	private String cor;
	private int peso;
	
	public Cachorro (String cor,int peso,String nome,int idade) {
		super(nome,idade);
		this.cor = cor;
		this.peso = peso;
				
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
         public void ImprimirInformacoesp() {
        	 System.out.println("\nO cachorro se chama: Princesa "+"\nTem a Idade:2 anos "+"\ne da cor:Preta "+"\nTem o peso de:10 kg");
         }
}

