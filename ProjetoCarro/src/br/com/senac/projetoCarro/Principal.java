package br.com.senac.projetoCarro;
import java.util.Scanner;
class Principal {

	public static void main(String[] args) {
		
		/*
		 Scanner stringScanner = new Scanner(System.in);
		
		 
		 System.out.println("informe a marca: ");
		 String marca = stringScanner.nextLine();
		 
		 System.out.println("informe o modelo do carro: ");
		 String modelo = stringScanner.nextLine();
		 
		 System.out.println("informe a placa do carro: ");
		 String placa = stringScanner.nextLine();
		 
		 System.out.println("informe a velocidade: ");
		 float velocMax =  stringScanner.nextFloat(); 
		  */

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
		 
		 
	}

}
