package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb;

		do {
			System.out.print("Veuillez entrer un nombre entre 1 et 10 : ");
			nb = scanner.nextInt();
		} while (nb < 1 || nb > 10);

		System.out.println("Le nombre que vous avez entré est : " + nb);

		scanner.close();

	}

}
