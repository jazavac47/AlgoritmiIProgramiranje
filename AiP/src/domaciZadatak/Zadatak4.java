package domaciZadatak;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		int niz[] = new int[10];
		int pozitivni = 0;
		int negativni = 0;
		int nule = 0;
		
		
		System.out.println("Unesi 10 cijelih brojeva:");
        
		
		for(int i = 0; i<niz.length; i++) {
			
			niz[i] = input.nextInt();
			
			if(niz[i] > 0){
				pozitivni++;
				
			}else if(niz[i] < 0) {
				negativni++;
			}else {
				nule++;
			}
			
			
			
			
		}
		System.out.println("Pozitivnih ima " + pozitivni);
		System.out.println("Negativnih ima "+ negativni);
		System.out.println("Nula ima "+ nule);
		
		
		
		
	}

}
