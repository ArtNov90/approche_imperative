package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int plusGrand = Integer.MIN_VALUE;
		
		System.out.println("Veuillez saisir 10 nombres :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();
            if (nombre > plusGrand) {
                plusGrand = nombre; 
            }
        }
        
        System.out.println("Le plus grand nombre saisi est : " + plusGrand);
        
        scanner.close();

	}

}
