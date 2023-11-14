package br.com.senac.projetoCarro;

public final class Passeio extends Veiculo {
	private int qtdPassageiros;

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	
	public Passeio() {
		super();
		this.qtdPassageiros = 0;		
	}

	
	@Override
	public String toString() {
		return "******** Veiculo Passeio : " +
	"Marca:= " +
	 getMarca() 
	+ ", Placa= " 
	+ getPlaca() 
	+ ", Passageiros= "
				+ getQtdPassageiros() 
				+ ", Modelo= " 
				+ getModelo() 
				+ ", Velocidade Maxima= " 
				+ calcVel() 
				+ ", Potencia do Motor= " 
				+ getPotencia() 
				+ ", Qtd de Pistões= "
				+ getQtdPist() 
				+ "*******************";
	}
	
	
	
	
}
