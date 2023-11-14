package br.com.senac.projetoCarro;

public final class Carga extends Veiculo{

	private int cargaMax;
	private int taxa;
	
	public Carga() {
		super();
		this.setCargaMax(0);
		this.setTaxa(0);
		
	}
	
	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	
	
	public int getTaxa() {
		return taxa;
	}

	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	
	public String toString() {
		return "******* Veiculo Carga : " +
	"Marca:= " +
	 getMarca() 
	+ ", Placa do Veiculo= " 
	+ getPlaca() 
	+ ", Carga Maxima= "
				+ getCargaMax() 
				+", taxa= "
				+ getTaxa()
				+ ", Modelo= " 
				+ getModelo() 
				+ ", Velocidade Maxima= " 
				+ calcVel() 
				+ ", Qtd de Pistões= "
				+ getQtdPist() 
				+ ", Potencia do Motor= " 
				+ getPotencia() 
				+ "*******************";
	}
	
}
