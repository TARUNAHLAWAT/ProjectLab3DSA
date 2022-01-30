package com.gl.DSAlab3;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String bracketExpression="([[{}]])";
		if(isBalanced(bracketExpression)) {
			System.out.print("Balanced brackets");
		}else {
			System.out.println("Unbalanced brackets");
		}

	}
	private static boolean isBalanced(String bracketExpression) {
		Stack<Character> stack= new Stack<Character>();
		
		for(int i=0; i<bracketExpression.length();i++) {
			char character = bracketExpression.charAt(i);
			if (character =='(' ||character =='[' ||character=='{') {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char c;
			switch(character) {
			case'}':
				c=stack.pop();
				if(c=='(' || c=='[')
					return false;
				break;
			case ')':
			c=stack.pop();
			if(c=='{'||  c=='[')
				return false;break;
			case']':
				c=stack.pop();
				if (c=='{'||  c=='(')
					return false;
				break;
			
			}
		}
		
		
		
		
		
		return stack.isEmpty();
	}

}
