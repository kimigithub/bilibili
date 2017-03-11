package com.adneom;

/**
 *this class used to divide a single-dimensional String arrays
 * @author ZHU Qingyuan
 *
 */

public class StringPartition {
	
	/**
	 * This method divides a single-dimensional String array by a defined size and saves as a two-dimensional array as return
	 * @param liste must be a single-dimensional String array
	 * @param taille must be a positive integer
	 * @return two-dimensional array
	 */
	public String[][] partition(String[] liste, int taille){
		int length = liste.length;
		String[][] str = new String[length][taille];
		for(int i=0; i*taille<length; i++){
			for(int j=0; j<taille; j++){
				if(j+i*taille<length){
					str[i][j] = liste[j+i*taille ];
				}
			}	
		}
		
		//display the new array in console
		for (int i = 0; i < str.length; i++) {
			System.out.print("[");
			for (int j = 0; j < str[i].length; j++) { 
				if(str[i][j]==null)
					break;
				System.out.print(str[i][j]);
				if(j+1 < str[i].length)
					System.out.print(",");
			}
		System.out.print("]");
		if(str[i+1][0]==null)
			break;
		if(i+1 < str.length)
			System.out.print(",");
		}
		return str;
	}
}
