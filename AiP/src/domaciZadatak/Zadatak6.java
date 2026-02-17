package domaciZadatak;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		int niz[] = new int[5];
		
		System.out.println("Unesi 5 cijelih brojeva:");
        
		for(int i = 0;i<niz.length; i++ ) {
			niz[i] = input.nextInt();
		}
		
		int kvadrati[] = new int[niz.length];
		int kvadratniIndeks = 0;
		
		for(int i = 0; i < niz.length; i++) {
			kvadrati[kvadratniIndeks] = (int)Math.pow(niz[i], 2);
			kvadratniIndeks++;
		}
		
		System.out.println("\nKvadrati unijetog niza:");
		for (int i = 0; i < kvadratniIndeks; i++) {
		    System.out.print(kvadrati[i] + " ");
		}
		
		
	}

}
