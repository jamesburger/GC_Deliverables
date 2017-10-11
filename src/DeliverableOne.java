import java.util.Scanner;
import java.lang.*;

public class DeliverableOne {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Initial input strings
		String numberOne = "";
		String numberTwo = "";
		
		//Variables to be used to convert above string into integers
		int convertOne = 0;
		int convertTwo = 0;
		
		//Individual character variables
		int userChar1 = 0;
		int userChar2 = 0;
		int userChar3 = 0;
		int userChar4 = 0;
		int userChar5 = 0;
		int userChar6 = 0;
		
		//Boolean variable to test the success of the program
		boolean userResult = false; 
		
		//Pairs for comparing and adding the individual integers 
		int pairOne = 0;
		int pairTwo = 0;
		int pairThree = 0;
		
		
		try {
		// Initial prompt to input number, as well as code to parse out the individual digits
		System.out.println("Please enter a three-digit number!");
		numberOne = scnr.nextLine();
		userChar1 = numberOne.charAt(0) - '0';
		userChar2 = numberOne.charAt(1) - '0';
		userChar3 = numberOne.charAt(2) - '0';
		
		//Converts string into integer for checking purposes
		 convertOne = Integer.parseInt(numberOne);
		
		// Logic for ensuring correct number is entered 
		 if (convertOne >= 100 && convertOne <= 999) {
			System.out.println("You put the right number!");	
		}
		else {
			System.out.println("You entered an incorrect number, make sure it's three digits!");
		} 
		
		 // Next prompt and input opportunity
		 System.out.println("Now enter a second three digit number!");
		 numberTwo = scnr.nextLine();
		    userChar4 = numberTwo.charAt(0) - '0';
			userChar5 = numberTwo.charAt(1) - '0';
			userChar6 = numberTwo.charAt(2) - '0';
			 convertTwo = Integer.parseInt(numberTwo);
			 
			 //Checks second input
		 if (convertTwo >= 100 && convertTwo <= 999) {
				System.out.println("You put the right number!");	
			}
			else {
				System.out.println("You entered an incorrect number, make sure it's three digits!");
			}
		 
		 // Combining individual integers from input to facilitate comparison 
		 pairOne = (userChar1 + userChar4);
		 pairTwo = (userChar2 + userChar5);
		 pairThree= (userChar3 + userChar6);
		 
		 //Final branch to test and see if the input digits complete the task!
		 
		 if ((convertOne < 100 || convertOne > 999) || (convertTwo < 100 || convertTwo > 999)) {
			 
			 System.out.println("ERROR"); 
		 }
		 else if ((pairOne == pairTwo) && (pairTwo == pairThree) && (pairOne == pairThree)) {
			 userResult = true;
			System.out.println("You did it! All integers in each number have the same sum!");
		 }
			else {
				System.out.println("Sorry, they didn't add up this time!");
			}
		 
		 
			
		}catch (Exception e) {
			//if ((convertOne < 100 || convertOne > 999) || (convertTwo < 100 || convertTwo > 999) ) {
				//System.out.println("ERROR");
			//}
			//else {
			System.out.println("ERROR");
			}
		}
			 
		 }
	
	 


