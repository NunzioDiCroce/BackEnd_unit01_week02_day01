package Esercizio1_Package;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1_Main {

	public static void main(String[] args) {

		// array definition
		int[] myArray = new int[5];

		// random items definition
		int item1 = new Random().nextInt(10) + 1;
		int item2 = new Random().nextInt(10) + 1;
		int item3 = new Random().nextInt(10) + 1;
		int item4 = new Random().nextInt(10) + 1;
		int item5 = new Random().nextInt(10) + 1;

		// array population
		myArray[0] = item1;
		myArray[1] = item2;
		myArray[2] = item3;
		myArray[3] = item4;
		myArray[4] = item5;

		// array print
		System.out.println("");
		System.out.println("ESERCIZIO 1");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("");
		System.out.println(
				"Array: " + myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3] + " " + myArray[4]);

		// array editing
		Scanner esercizioUno = new Scanner(System.in);

		String position;
		int positionInt = 1;
		String newItem;
		int newItemInt = 1;

		while (newItemInt != 0) {
			System.out.println("");
			System.out.println("Scegli la posizione dell'array da 0 a 4 che vuoi modificare:");
			position = esercizioUno.nextLine();
			positionInt = Integer.parseInt(position);
			System.out.println("");
			System.out.println("Indica il nuovo intero da 1 a 10 che vuoi inserire nella posizione scelta:");
			newItem = esercizioUno.nextLine();
			newItemInt = Integer.parseInt(newItem);

			// ArrayIndexOutOfBoundsException handling
			try {
				myArray[positionInt] = newItemInt;

				System.out.println("");
				System.out.println("Nuovo Array: " + myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3]
						+ " " + myArray[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posizione non valida!");
			}

		}

		myArray[positionInt] = newItemInt;

		System.out.println("");
		System.out.println("Termine programma");

		esercizioUno.close();

	}

}
