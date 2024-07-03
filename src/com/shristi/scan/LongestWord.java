package com.shristi.scan;

public class LongestWord {

	public static void main(String[] args) {

		String names = "Get ready to learn java";
		String result[] = names.split(" ");
		String output = "";
		int max = 0;

		for (String match : result) {
			if (max < match.length()) {

				max = match.length();
				output = match;
			} else if (max == match.length())
				output += match;
		}

		System.out.println("The longest word in the sentence is" + "\t" + max + " " + output);
	}

}
