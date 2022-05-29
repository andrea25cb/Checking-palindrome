package trabajos_programacion_def;

import java.util.Scanner;

class Checking_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Please, enter a word: ");
		
		String word = teclado.nextLine();
		
		int firstposition = 0, lastposition= word.length() - 1;
		boolean pali = true;
		
		while (firstposition < lastposition && pali){ 
				if (word.charAt(firstposition) != word.charAt(lastposition))
					pali = false;
			
				firstposition++;
				lastposition--;
		}
		
		if (pali) 
			System.out.println("Yes, " + word + " is a palindrome");
		else
			System.out.println("No, " + word + " is not a palindrome");
	} }


