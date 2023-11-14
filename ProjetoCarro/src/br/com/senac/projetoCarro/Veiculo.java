package br.com.senac.projetoCarro;


public class Veiculo extends Motor {
	
	private String placa = "";
    private String marca = "";
    private String modelo = "";
    private String cor = "";
    private float velocMax = 0;
    private int qtdRodas = 0;

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    
    public float calcVel() {
    	if (this instanceof Passeio) {	
    		
    		return  this.getVelocMax() * 1000;
    	}
    	else if (this instanceof Carga) {
    		return this.getVelocMax() * 100; 
    	}
    	else {
    		return this.getVelocMax();
    	}
    }

    @Override
    public void setPotencia(int potencia) {
        super.setPotencia(potencia); 
    }
    

    @Override
    public void setQtdPist(int qtdPist) {
        super.setQtdPist(qtdPist); 
    }

    public Veiculo() {

    }

    
}
