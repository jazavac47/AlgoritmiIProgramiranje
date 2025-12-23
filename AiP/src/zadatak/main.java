package zadatak;

import java.util.Scanner;

public class main {

	public static boolean daLiJePalindrom(int broj) {
        int original = broj;
        int obrnuti = 0;

        while (broj > 0) {
            int cifra = broj % 10;
            obrnuti = obrnuti * 10 + cifra;
            broj /= 10;
        }

        return original == obrnuti;
    }
	
	
	public static void ispisiPalindrome(int n) {
        int brojac = 0;

        for (int i = 1; i <= n; i++) {
            if (daLiJePalindrom(i)) {
                System.out.println(i + " ");
                brojac++;
            }
        }

        System.out.println();
        System.out.println("Ukupan broj palindroma: " + brojac);
    }
	
	
	
	
	public static void main(String[] args) {
		// Napisati program koji učitava ceo broj n.
		//Program treba da ispiše sve palindrom brojeve u intervalu od 1 do n, a zatim da ispiše ukupan broj takvih brojeva.

		
		Scanner input = new Scanner(System.in);	
		System.out.println("Unesite broj n: ");
		 int n = input.nextInt();
		
		
		 ispisiPalindrome(n);
		
		
	}

}
