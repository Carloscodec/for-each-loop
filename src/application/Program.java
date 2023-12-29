package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many names? ");
		int n = input.nextInt();
		String vect[] = new String[n];
		
		input.nextLine();
		for (int i = 0; i < vect.length; i++) {
			System.out.print("#" + (i + 1) + " Name: ");
			vect[i] = input.nextLine();
		}
		
		System.out.println();
		System.out.println("Names inserted: ");
		for (String name : vect) {
			System.out.println(name);
		}
		
		input.close();
	}

}
