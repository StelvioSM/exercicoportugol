package ProgramaçãoObjetos;

public class Cliente {
//declaração de atributos
	
	private String nomeDoCliente;
	private String tempoClientela;
	private String divida;
	private int idadeDocliente;
	
	//metodo construtor//
	
	public Cliente (String nomeDoCliente,String tempoClientela,String divida,int idadeDocliente)
	{
		this.nomeDoCliente=nomeDoCliente;
		this.tempoClientela=tempoClientela;
		this.divida=divida;
		this.idadeDocliente=idadeDocliente;
		
	}
	
	public Cliente (String tempoClientela) {
		
		this.tempoClientela=tempoClientela;
	}
	
		
	//declaração dos demais metodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nQual nome do cliente?:"+nomeDoCliente+"\ntempo de cliente:"+tempoClientela+"\nDinheiro gasto R$"+divida+"\nidade do cliente"+"\n"+idadeDocliente);
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public String getTempoClientela() {
		return tempoClientela;
	}

	public void setTempoClientela(String tempoClientela) {
		this.tempoClientela = tempoClientela;
	}

	public String getdivida() {
		return divida;
	}

	public void setdivida(String contadinheiro) {
		this.divida = contadinheiro;
	}

	public int getIdadeDocliente() {
		return idadeDocliente;
	}

	public void setIdadeDocliente(int idadeDocliente) {
		this.idadeDocliente = idadeDocliente;
	}
	
	
}
