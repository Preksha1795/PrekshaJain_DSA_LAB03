package com.gl.javafsd.dsa.balancedbrackets;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		String expression = scanner.nextLine();
		scanner.close();
		
		BalancedBracketsChecker checker = 
			new BalancedBracketsChecker(expression);
		
		boolean result = checker.check();
		if (result) {
			System.out.printf("Expression %s is balanced", expression);
		}else {
			System.out.printf("Expression %s is NOT balanced", expression);
		}
		
	}

}
