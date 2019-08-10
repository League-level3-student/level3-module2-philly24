package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int crackIndex = 0;
		for (int i = 0; i < eggs.size() ; i++) {
			if (eggs.get(i).equals("cracked")) {
			crackIndex = i;
			break;
			}
			
		}
		
		return crackIndex;
		
		
		
	
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearlCount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlCount = i;
				break;
			}
			
		}
		
		return pearlCount;
		

	}

	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = words.get(0);
	for (int i = 0; i < words.size(); i++) {
		if (words.get(i).length() > longestWord.length()) {
			longestWord = words.get(i);
			break;
		}
	}
		return longestWord;
	}

	public static Boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		 String correctCode = "";
		 for (int i = 0; i < message.size(); i++) {
			 correctCode += message.get(i);
		}
		 if (correctCode.contains("... --- ...")) {
			return true;
		}
		 else {
			return false;
		}
		
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int i = 0; i < results.size(); i++) {
			int index = i;
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(j) < results.get(index)) {
					index = j;
				}
			}
			double temp = results.get(index);
			results.set(index, results.get(i));
			results.set(i, temp);
		}
		return results;
	}

	public static List<String> sortDNA(List<String> DNA) {
		// TODO Auto-generated method stub
		for(int i = 0; i < DNA.size(); i++) {
			int shortest = i;
			for(int j = i + 1; j < DNA.size(); j++) {
				if(DNA.get(j).length() < DNA.get(i).length()) {
					shortest = j;
				}
			}
			String switching = DNA.get(shortest);
			DNA.set(shortest, DNA.get(i));
			DNA.set(i, switching);
		}
		return DNA;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.size(); i++) {
			int lowerOrder = i;
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(j).compareTo(words.get(lowerOrder)) < 0) {
					lowerOrder = j;
				}
			}
			String switching = words.get(lowerOrder);
			words.set(lowerOrder, words.get(i));
			words.set(i, switching);
		}
		return words;
	}
		
	




}
