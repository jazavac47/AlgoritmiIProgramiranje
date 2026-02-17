package domaciZadatak;

import java.util.Scanner;

public class Zadatak2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi broj clanova niza");
		
		int brojClanova = input.nextInt();
		int niz[] = new int[brojClanova];
		int zbir = 0;
		double aritmetickaVrijednost =(double)zbir / brojClanova;
		
		System.out.println("Uneti clanove niza");
		
		
		for(int i = 0 ; i<brojClanova; i++) {
			niz[i] = input.nextInt();
			zbir += niz[i];
		}
		
		System.out.println("Zbir iznosi " + zbir);
		System.out.println("Aritmeticka vrijednost iznosi" + aritmetickaVrijednost);
		
		
		
	}
	
}
