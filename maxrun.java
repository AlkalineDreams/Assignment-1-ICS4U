/****************************************************************************
 * Created by: Craig Dwyer
 * Created on: 09/18/16
 * This program finds the maximum run of characters in a string.
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxrun {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter a string.");
		
		//initializing user input
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		//assigning user input to variable
		String userInput = (br.readLine());
		
		System.out.println("The maximum run of your string is " + MaxRun(userInput) + ".");

	}
	
	public static int MaxRun(String userInput){
		
		//function that finds the maximum run of a string.
		//initializing variables
		int maxRun = 1;
		int currentRun = 0;
		char lastLetter = userInput.charAt( 0 );
		
		for (int count = 0; count < userInput.length(); count++){
			//loop that loops until each character in string is done.
			
			if (lastLetter == userInput.charAt(count)){
				//adds one more number to the current run.
				currentRun++;
				//System.out.println("current run: " + currentRun);
				if (currentRun > maxRun){
					//if the current count is higher than the max, it's the new max.
					maxRun = currentRun;
				}
			} else {
				
				//if the last letter was different than this one, reset currentRun to 1.
				currentRun = 1;
			}
			
			//makes the current letter the new last letter before re-looping.
			lastLetter = userInput.charAt(count);

		}
		
		return maxRun;
	}

}
