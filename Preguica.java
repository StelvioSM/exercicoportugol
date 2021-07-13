package Teste1;

public class Preguica extends Animal {
      private String raca;
      private int tempo;
      
      public Preguica (String raca, int tempo, String nome, int idade) {
  		super(nome,idade);
  		this.raca = raca;
  		this.tempo = tempo;
      
}
	public String getraca()
		return raca;
	}

	public void setraca(String tamanho, String raca) {
		this.raca = raca;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
		System.out.println( 
				"\nO Preguica se chama: sono " + "\n tem a Idade:4 anos  " + "raca:cinza " + "\n leva o tempo de :7 minutos para andar ");
	}
	public void ImprimirInformcoesm() {
		// TODO Auto-generated method stub
		
	}
}