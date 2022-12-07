package com.samplePrograms;

import java.util.HashSet;
import java.util.Set;

class Combinations{
	public static Set<String> getCombinations(String str){
		Set<String> combinations = new HashSet<String>();
		
		if(str == null) {
			return null;
		}else if(str.length() == 0) {
			combinations.add("");
			return combinations;
		}
		
		char firstLetter = str.charAt(0);
		String subString = str.substring(1);
		
		Set<String> words = getCombinations(subString);
		for (String str1 : words) {
			for(int i=0;i<=str1.length();i++) {
				combinations.add(str1.substring(0,i)+firstLetter+str1.substring(i));
			}
		}
		return combinations;
	}
}

public class StringCombinations {

	public static void main(String[] args) {
		String inputString = "MahesWar";
		System.out.println("Combinations of "+inputString+" : "+Combinations.getCombinations(inputString));

	}

}
