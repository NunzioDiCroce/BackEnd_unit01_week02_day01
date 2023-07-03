package Esercizio2_Package;

import java.util.Scanner;

public class Esercizio2_Main {

	public static void main(String[] args) {

		// variables definition
		// String km;
		// String litri;

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
		double kmInt = Integer.parseInt(km);
		System.out.println("Inserisci i litri di carburante consumati: ");
		String litri = esercizioDue.nextLine();
		double litriInt = Integer.parseInt(litri);

		// try {
		double kmLitro = kmInt / litriInt;
		System.out.println("La tua auto ha registrato un consumo di " + kmLitro + " km/litro");
		System.out.println("");
		System.out.println("Termine programma");

		// } catch () {

		// }

	}

}
