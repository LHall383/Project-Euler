package problem008;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Lucas Hall
 * Date: 9/16/2016
 * Main driver class for problem 8 of Project Euler - largest product in a series
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		URL url = Main.class.getResource("input.txt");
		
		
		final int NUM_DIGITS = 13; //number of adjacent digits to look for
		long result = 0; //product of the digits
		String input="";
		
		//Read input from the file input.txt
		try{
			File file = new File(url.toURI());
			
			Scanner fileIn = new Scanner(file);
			
			input = fileIn.nextLine();
			
			fileIn.close();
		}catch(IOException e){
			e.printStackTrace();
		}catch(URISyntaxException f){
			f.printStackTrace();
		}
		
		//Iterate through the input number
		for(int i=0; i<input.length() - NUM_DIGITS; i++){
			long num = 1;
			//Go through the next NUM_DIGITS digits and multiply them together
			for(int j=0; j<NUM_DIGITS; j++){
				num *= Integer.parseInt(input.substring(i+j, i+j+1));
			}
			//Keep track of the largest number
			if(num > result){
				result = num; 
			}
		}
		
		//Print result
		System.out.printf("Result: %d\n", result);
		
		
	}

}
