package fr.algorithmie;



public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[]array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int[]array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		 
        int maxLength = Math.max(array1.length, array2.length);
        int[] adjustedArray1 = new int[maxLength];
        int[] adjustedArray2 = new int[maxLength];
        
        
        for (int i = 0; i < maxLength; i++) {
            adjustedArray1[i] = (i < array1.length) ? array1[i] : 0; 
            adjustedArray2[i] = (i < array2.length) ? array2[i] : 0; 
        }
        
        
        int[] somme = new int[maxLength];
        
       
        for (int i = 0; i < maxLength; i++) {
            somme[i] = adjustedArray1[i] + adjustedArray2[i];
        }
        
        
        System.out.println("Tableau somme :");
        for (int i = 0; i < maxLength; i++) {
            System.out.println(somme[i]);
        }

	}

}
