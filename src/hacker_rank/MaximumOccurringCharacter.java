package hacker_rank;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaximumOccurringCharacter {

	public static void maximumOccurringCharacter() {
		// Write your code here
		// Keep track of every character
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// Creating HashMap Object
		HashMap<Character, Integer> hMap = new HashMap<>(); // create hash map object
		
		for (int i = 0; i < input.length(); i++) { // iterating through each character
			char ch = input.charAt(i); 	// char value assigned to 'ch'
			if (hMap.containsKey(ch)) { // if hMap has the indexed char already, return it's value
				int x = hMap.get(ch);
				int y = x + 1;			// if not, add 1 to the value.
				hMap.put(ch, y); 		// adds the char, and the associated value 
			} else {
				hMap.put(ch, 1);		// adds the char, and
			}
		}
		char maxChar = input.charAt(0); 			 // first character at index 0, init the count
		for (Character key : hMap.keySet()) { 		 // assign 'key' as item of the hMap, with data type 'Char'. Returns the keys from hMap 
			if (hMap.get(key) > hMap.get(maxChar)) { // if the key is > than the indexed char
				maxChar = key;					 	 // ... then set it to the maxChar
			}
		}
		System.out.println(maxChar); // display maxChar
		/*
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		// Store characters
		String chars = "";
		String extra = "";
		
		
		for (int i = 0; i < inp.length(); i++) {
			
			String x = Character.toString(inp.charAt(i)); // Current character
			if (chars.contains(x)) { 
				if (!extra.contains(x)) { 
					extra += x + ","; // add to duplicate string
				}
			}
			chars += x; 
		}
		System.out.println(extra);
		*/
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		// Creating HashMap Object
		HashMap<Character, Integer> hMap = new HashMap<>(); // create hash map object
		
		for (int i = 0; i < input.length(); i++) { // iterating through each character
			char ch = input.charAt(i); 	// char value assigned to 'ch'
			if (hMap.containsKey(ch)) { // if hMap has the indexed char already, return it's value
				int x = hMap.get(ch);	// x var to get the value.
				int y = x + 1;			// y var to add 1 to the value.
				hMap.put(ch, y); 		// adds the char, and the associated value + 1
			} else {
				hMap.put(ch, 1);		 // else, map 1 to the indexed value
			}
		}
		char maxChar = input.charAt(0); 			 // first character at index 0, init the count
		for (Character key : hMap.keySet()) { 		 // assign 'key' as item of the hMap, with data type 'Char'. Returns the keys from hMap 
			if (hMap.get(key) > hMap.get(maxChar)) { // if the key is > than the indexed char
				maxChar = key;					 	 // ... then set it to the maxChar
			}
		}
		System.out.println(maxChar); // display maxChar
		/*
		 * // Iterates through the string completely String s =
		 * "abcdefghijklmnopqrstuvwxyz";
		 * 
		 * char[] chars = s.toCharArray();
		 * 
		 * for (char ch : chars) { 
		 * 		System.out.println(ch); 
		 * }
		 * 
		 * 
		 */
		// Iterates through the linked hash map to check add to the values.

		// maximumOccurringCharacter(text);
		
		
		/*
		 * 
		 * 
		 * 
		 */
		 
	}
}
