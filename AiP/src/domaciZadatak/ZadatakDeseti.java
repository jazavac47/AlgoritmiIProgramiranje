package domaciZadatak;

import java.util.Scanner;

public class ZadatakDeseti {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int niz[] = new int[5];
		
		System.out.println("Unesi 5 cijelih brojeva:");
        
		for(int i = 0;i<niz.length; i++ ) {
			niz[i] = input.nextInt();
		}
		for (int i = 0; i < niz.length / 2; i++) {
		    int temp = niz[i];
		    niz[i] = niz[niz.length - 1 - i];
		    niz[niz.length - 1 - i] = temp;
		}
		System.out.println("Obrnuti niz:");
		for (int i = 0; i < niz.length; i++) {
		    System.out.print(niz[i] + " ");
		}

	}

}
