package in.prec.logicalprogram.reversestring.main;

import java.util.Scanner;

import in.prec.logicalprogram.reversestring.ReverseString;

public class MainReverseString {
	public static void main(String[] args) {
		ReverseString reversestring=new ReverseString();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Address to reverse:");
		String temp=scanner.nextLine();
		reversestring.setVariable(temp);
		//String result=reversestring.reverseString();
		String result=reversestring.reverseStringLine();
		System.out.println(result);
		
		scanner.close();
		}

}
