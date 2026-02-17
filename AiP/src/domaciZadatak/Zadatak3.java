package domaciZadatak;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj clanova niza:");
		int x = input.nextInt();
		int[] niz = new int[x];
		
		
		
		
		
        
        System.out.println("Unesi elemente niza:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }
        
        
        
        int max = niz[0];
		int min = niz[0];
        
		
		
		
        for (int i = 0; i < niz.length; i++) {
            if(niz[i] > max) {
            	max = niz[i];
            }
            
            if(niz[i] < min) {
            	min = niz[i];
            }
        }
        
        
        System.out.println("Najveci element je " + max);
		System.out.println("Najmanji element je " + min);

	}

}
