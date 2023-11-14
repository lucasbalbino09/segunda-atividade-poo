package br.com.senac.projetoCarro;

class Principal {

	public static void main(String[] args) {
		
		

		 Passeio passeio1 = new Passeio();
		 passeio1.setMarca("Nissan");
		 passeio1.setModelo("March");
		 passeio1.setPlaca("ABC 1234");
		 passeio1.setVelocMax(200);
		 passeio1.setQtdPassageiros(5);
		 passeio1.setPotencia(70);
		 passeio1.setQtdPist(3);
	        

		 Carga carga1 = new Carga();
		 carga1.setMarca("Fiat");
		 carga1.setModelo("Strada");		 
		 carga1.setPlaca("BBB 3333");
		 carga1.setVelocMax(164);
		 carga1.setCargaMax(785);
		 carga1.setTaxa(1084);
		 
		 System.out.println(passeio1);
		 System.out.println(carga1);
		 
	}

}
