package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is n");
		int n = in.nextInt();

		boolean [] array = new boolean [n];

		for (int counter = 0; counter<n; counter++) {
			array[counter]=true;
		}
		
		for (int counter = 2 ; counter <=Math.sqrt(n) ; counter++) {
			if(array[counter] == true) {
				for(int j = (counter*counter); j<n; j=j+counter) {
					array[j] = false;
				} 
			}

		}
		System.out.println("Prime Numbers ");
		for (int counter = 2; counter<array.length; counter++) {
			if(array[counter]==true) {
				System.out.println(counter);
			}
		}



	}
}
