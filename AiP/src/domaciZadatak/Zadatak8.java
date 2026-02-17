package domaciZadatak;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Upisati broj clanova nizova");
		int x = input.nextInt();
		
		int niz1[] = new int[x];
		int niz2[] = new int[niz1.length];
		int niz3[] = new int[niz1.length];
		
		
		
		System.out.println("Upisati elemente prvog niza");
		for(int i = 0;i<niz1.length;i++) {
			niz1[i] = input.nextInt();
		}
		
		System.out.println("Upisati elemente drugog niza");
		for(int i = 0;i<niz2.length;i++) {
			niz2[i] = input.nextInt();
		}
		
		System.out.println("Clanovi treceg niza su");
		for(int i = 0 ; i<niz1.length ; i++) {
			niz3[i] = niz1[i] + niz2[i];
			System.out.println(niz3[i] + " ");
		}
		
		
		
		

	}

}
