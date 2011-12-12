package com.project.euler.net;

import java.util.ArrayList;

public class Problem2 {

	/**
	 * @param args
	 */
	static ArrayList<Integer> fiblist = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

			//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

			//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
		preparefibonacciListLessThan4Million();
		
	}
	
	public  static void preparefibonacciListLessThan4Million()
	{
		final int upperlimit = 4000000;
int sum =0 ;		
		int fibVariableOne = 1;
		int fibVariableTwo = 2; 
		int fibVariableThree = 0;
	sum = sum  + 2 ;// for the fibvariableTwo = 2 
			

				while(fibVariableThree<upperlimit)
				{
					fibVariableThree = fibVariableOne + fibVariableTwo;
					if(fibVariableThree%2 ==0 && fibVariableThree<upperlimit)
						{
						sum = sum + fibVariableThree;
						System.out.println(fibVariableThree);
						}
					fibVariableOne = fibVariableTwo;
					fibVariableTwo = fibVariableThree;
					
					
					
				}
				
				System.out.println("sum is : " + sum);
		
		
	}
	

}
