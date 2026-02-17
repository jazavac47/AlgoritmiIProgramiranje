package domaciZadatak;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int niz[] = new int[5];
		
		
		System.out.println("Upisati 5 cijelih clanova niza");
		for(int i = 0; i<niz.length;i++) {
			niz[i] = input.nextInt();
		}
		
		System.out.println("Upisi cijeli broj za pretragu");
		int indeks = input.nextInt();
		
		boolean pretraga = false;
		
		
		
		for(int i = 0; i<niz.length; i++) {
			
			if(indeks == niz[i]) {
				System.out.println("Nalazi se u indeksu " + i);
				pretraga = true;
				break;
			}
			
		}
		
		if (!pretraga) {
		    System.out.println("Broj se ne nalazi u nizu.");
		}
		
		
		

	}

}
