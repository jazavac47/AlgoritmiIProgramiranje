package domaciZadatak;

import java.util.Scanner;

public class ZadatakJedanaesti {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int niz[] = new int[5];
		
		System.out.println("Unesi 5 cijelih brojeva:");
        
		for(int i = 0;i<niz.length; i++ ) {
			niz[i] = input.nextInt();
		}
		
		int zadnji = niz[niz.length - 1];

		for (int i = niz.length - 1; i > 0; i--) {
		    niz[i] = niz[i - 1];
		}

		niz[0] = zadnji;
		
		System.out.println("Pomjereni niz:");
		for (int i = 0; i < niz.length; i++) {
		    System.out.print(niz[i] + " ");
		}

	}

}
