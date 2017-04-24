package com.bridgelabz.Programs;

import com.bridgelabz.Util.Utility;

class BalanceParenthsis {
	public static void main(String[] args) {

		Utility utility = new Utility();

		String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";

		boolean balance = utility.isBalanced(string);

		if (balance)
			System.out.println("balenced");
		else
			System.out.println("not balenced");
	}

}
