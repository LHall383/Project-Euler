package problem051;

import lib.Primes;

/**
 * @author Lucas Hall
 * Date: 2016-09-16
 * Description: Main driver file for problem 51 - prime digit replacements
 */
public class Main {

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		//Number of primes in the 'family' of numbers
		//Every 10 numbers are a family eg. 0-9 and 780-789 are both families
		int familySize = 0, targetFamilySize = 7;
		//The value at which each family begins, initialized to the first number of the first family
		long familyStart = 50000; //Starts at 50000 to make the process faster
		//The solution will be stored here
		long smallestPrime = 0;
		boolean[] binary = new boolean[100];
		String binaryString;
		
		while(familySize < targetFamilySize){
			int countPrimes = 0;
			String familyStartString = String.format("%d", familyStart);
			
			//Create array of current family
			long[] values = new long[10];
			for(int i=9; i>=0; i--){
				values[i] = familyStart+i;
//				if(Primes.isPrime(num)){
//					countPrimes++;
//					smallestPrime = num;
//				}
			}
			
			binaryString = Integer.toBinaryString((int)Math.pow(2, familyStartString.length()) - 1);
			
			
			
			//Assign the size to familySize if it is the largest so far
			if(countPrimes > familySize){
				familySize = countPrimes;
				System.out.printf("Current Family Size: %d\n", familySize);
			}
			
			//Iterate to next family
			familyStart += 10;
			if(familyStart%1000==0){
				System.out.printf("Starting family %d\n", familyStart);
			}
		}
		
		System.out.printf("Smallest Prime: %d\n", smallestPrime);

	}

}
