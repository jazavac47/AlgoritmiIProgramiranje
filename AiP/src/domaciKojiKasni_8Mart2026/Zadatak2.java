package domaciKojiKasni_8Mart2026;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int broj = unesiBroj(input);

        int faktorijal = izracunajFaktorijal(broj);
        

        ispisiRezultat(broj, faktorijal);
	}
	
	public static int unesiBroj(Scanner input) {
        System.out.print("Unesite broj: ");
        return input.nextInt();
    }
	
	public static int izracunajFaktorijal(int n) {

        int rezultat = 1;

        for (int i = 1; i <= n; i++) {
            rezultat =rezultat * i;
        }

        return rezultat;
    }
	
	public static void ispisiRezultat(int broj, int faktorijal) {

        System.out.println("Broj: " + broj);
        System.out.println("Faktorijal: " + faktorijal);
    }

}
