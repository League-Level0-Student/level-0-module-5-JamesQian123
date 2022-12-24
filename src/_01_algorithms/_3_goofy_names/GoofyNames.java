package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		String james = name.toUpperCase();
		System.out.println(james);
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		for(int i = 0; i<name.length(); i++) {
			char bob = name.charAt(i);
			if(i%2 == 0) {
				bob = Character.toUpperCase(bob);
				goofyName += bob;
				
				}
			else {
				bob = Character.toLowerCase(bob);
				goofyName += bob;
				
				
			}
		}
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
			
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, goofyName);

	}
}

