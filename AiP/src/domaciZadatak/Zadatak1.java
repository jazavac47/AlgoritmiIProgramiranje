package domaciZadatak;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] niz = new int[10];

        
        System.out.println("Unesi 10 cijelih brojeva:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        
        System.out.println("Elementi niza su:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

        

	}

}
