package domaciZadatak;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int niz[] = new int[10];
		
		
		
		
		System.out.println("Unesi 10 cijelih brojeva:");
        
		for(int i = 0;i<niz.length; i++ ) {
			niz[i] = input.nextInt();
			
		}
		
		for(int i = 0; i<niz.length; i++) {
			if(niz[i] % 2 == 0 && niz[i] != 0) {
				System.out.println(niz[i] + " je paran");
			}else if(niz[i] % 2 != 0 && niz[i] != 0) {
				System.out.println(niz[i] + " je neparan");
			}else {
				System.out.println("Nula");
			}
		}
		
		
	}

}
