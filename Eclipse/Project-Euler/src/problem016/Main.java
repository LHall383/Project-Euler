package problem016;

import java.math.BigInteger;

/**
 * 
 * @author Lucas Hall
 * Date: 9/16/2016
 * Main driver class for problem 16 of Project Euler - power digit sum
 *
 */
public class Main {

	public static void main(String[] args) {
		final int exponent = 1000;
		BigInteger power = BigInteger.ONE;
		String result;
		int sum = 0;
		
		//Calculate power of 2
		for(int i=0; i<exponent; i++){
			power = power.multiply(BigInteger.valueOf(2));
		}
		//Print power
		System.out.printf("%d\n", power);
		//Switch from BigInteger to string
		result = power.toString();
		//Sum the digits of result
		for(int i=0; i<result.length(); i++){
			sum += Integer.parseInt(result.substring(i,i+1));
		}
		//Print the sum of the digits
		System.out.printf("%d", sum);
		
	}

}
