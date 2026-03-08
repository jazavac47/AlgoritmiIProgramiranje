package domaciKojiKasni_8Mart2026;

import java.util.Random;

public class Zadatak {
	
	static Random randominacija = new Random();

	
	
	

	public static void main(String[] args) {
		 igrajPikado();

	}
	
	
	
	 public static void igrajPikado() {

	        int igrac1 = 500;
	        int igrac2 = 500;
	        int runda = 1;

	        while (igrac1 > 0 && igrac2 > 0) {

	            System.out.println("Runda " + runda);

	            igrac1 = novaVrijednost(igrac1);
	            igrac2 = novaVrijednost(igrac2);

	            System.out.println("-------------------------");

	            runda++;
	        }

	        proglasiPobednika(igrac1, igrac2);
	    }
	 
	 
	 	
	 public static int novaVrijednost(int trenutnaVrijednost) {

	        int pogodak = randominacija.nextInt(61); // 0–60

	        trenutnaVrijednost -= pogodak;

	        if (trenutnaVrijednost < 0) {
	            trenutnaVrijednost = 0;
	        }

	        System.out.println("Pogodak: " + pogodak + " | Ostalo: " + trenutnaVrijednost);

	        return trenutnaVrijednost;
	    }
	 
	 
	 
	 
	 public static void proglasiPobednika(int igrac1, int igrac2) {

	        if (igrac1 == 0 && igrac2 == 0) {
	            System.out.println("Nerešeno!");
	        } else if (igrac1 == 0) {
	            System.out.println("Pobednik je Igrač 1!");
	        } else {
	            System.out.println("Pobednik je Igrač 2!");
	        }
	    }

}
