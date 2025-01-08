package in.prec.logicalprogram.charactercounter.main;

import java.util.Scanner;

import in.prec.logicalprogram.charactercounter.CharacterCounting;

public class MainCharaterCounting {
	public static void main(String[] args) {
		CharacterCounting charCounting=new CharacterCounting();
		Scanner sc=new Scanner(System.in);
		//CharacterCounting count=new CharacterCounting();
		System.out.println("Enter the string");
		
		String string=sc.next();
		charCounting.setVariable(string);
		
		charCounting.countVowels();
		
	}

}
