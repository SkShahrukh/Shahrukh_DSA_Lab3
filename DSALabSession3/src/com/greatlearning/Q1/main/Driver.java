package com.greatlearning.Q1.main;

import com.greatlearning.Q1.service.BalancingBrackets;

public class Driver {
	
	// Driver code
	public static void main(String[] args) {
		
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])";
				
		Boolean result;
		
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		
	}
}
