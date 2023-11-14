package br.com.senac.projetoCarro;
import java.text.DecimalFormat;

public final class Passeio extends Veiculo {
	private int qtdPassageiros;
	
	DecimalFormat formato = new DecimalFormat("#.###"); 
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
				+ formato.format(calcVel()) 
				+ ", Potencia do Motor= " 
				+ getPotencia() 
				+ ", Qtd de Pistões= "
				+ getQtdPist() 
				+ " *******************";
	}
	
	
	
	
}
