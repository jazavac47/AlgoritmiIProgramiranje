package domaciZadatak;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int niz[] = new int[5];
		
		System.out.println("Unesi 5 cijelih brojeva:");
        
		for(int i = 0;i<niz.length; i++ ) {
			niz[i] = input.nextInt();
		}
		
		
		int maxBroj = niz[0];
		int maxPonavljanja = 0;

		for (int i = 0; i < niz.length; i++) {
		    int brojac = 0;

		    for (int j = 0; j < niz.length; j++) {
		        if (niz[i] == niz[j]) {
		            brojac++;
		        }
		    }

		    if (brojac > maxPonavljanja) {
		        maxPonavljanja = brojac;
		        maxBroj = niz[i];
		    }
		}

		System.out.println("Broj koji se najvise ponavlja: " + maxBroj);
		System.out.println("Ponavlja se " + maxPonavljanja + " puta.");

	}

}
