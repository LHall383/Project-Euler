package lib;

/**
 * @author Lucas Hall
 * Date: 2016-09-16
 * Description: Library of useful functions for prime numbers.
 */
public class Primes {
	
	/**
	 * Iterative prime checking method, starts at 2 and checks for divisibility of each number up to
	 * the square root of checkNum.
	 * 
	 * @param checkNum number to check for primality
	 * @return true if checkNum is prime, false if checkNum is composite
	 */
	public static boolean isPrime(long checkNum){
		long maxCheck = (long) Math.sqrt(checkNum);
		//Start with 2 and go to maxCheck, check divisible, if so return false
		for(long i=2; i<=maxCheck; i++){
			if(checkNum%i == 0){
				return false;
			}
		}
		//If it didn't return false, it must be prime
		return true;
	}

}
