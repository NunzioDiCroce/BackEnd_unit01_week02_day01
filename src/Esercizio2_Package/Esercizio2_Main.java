package Esercizio2_Package;

import java.util.Scanner;

public class Esercizio2_Main {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("ESERCIZIO 2");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("");

		// scanner definition
		Scanner esercizioDue = new Scanner(System.in);

		// data entry
		System.out.println("Calcola le prestazioni della tua auto");
		System.out.println("Inserisci i km percorsi: ");
		String km = esercizioDue.nextLine();
		int kmInt = Integer.parseInt(km);
		System.out.println("Inserisci i litri di carburante consumati: ");
		String litri = esercizioDue.nextLine();
		int litriInt = Integer.parseInt(litri);

		try {
			int kmLitro = kmInt / litriInt;
			System.out.println("La tua auto ha registrato un consumo di " + kmLitro + " km/litro");
			System.out.println("");
			System.out.println("Termine programma");
			System.out.println("Riavviare l'applicazione");

		} catch (ArithmeticException e) {
			System.out.println("Hai inserito 0 litri, questo valore non è consentito.");
			System.out.println("");
			System.out.println("Termine programma");
			System.out.println("Riavviare l'applicazione");
		}

		esercizioDue.close();

	}

}
