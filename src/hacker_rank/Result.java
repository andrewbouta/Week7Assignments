package hacker_rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*

class Result {

  

     // The function is expected to return a CHARACTER.
     // The function accepts STRING text as parameter.
     
     
     int charCount = 0;
     // static final int ASCII = 256;

    public static char maximumOccurringCharacter(String text) {
    // Write your code here
        HashMap<Character, Integer> hMap = new HashMap<>(); // create hash map object
        
        for (int i = 0; i < text.length(); i++) { // iterating through each character
            char ch = text.charAt(i);    // char value assigned to 'ch'
            if (hMap.containsKey(ch)) { 
                int x = hMap.get(ch);    // gets indexed char to start
                int y = x + 1;           // if not, add 1 to the value
                hMap.put(ch, y);         // if hMap has the indexed char already, return it's value + 1
            } else {
                hMap.put(ch, 1);        // adds the char, use 1 for the value
            }
        }
        char result = text.charAt(0);              // first character at index 0, init the count
        for (Character key : hMap.keySet()) {          // assign 'key' as item of the hMap, with data type 'Char'. Returns the keys from hMap 
            if (hMap.get(key) > hMap.get(result)) { // if the key is > than the indexed char
                result = key;                          // ... then set it to the maxChar
            }
        }
        System.out.println(result); //  displays result
       
            
        
        
        if (text == null || text.isEmpty()) {
            System.out.println("Please enter text to be tested.");
        }
        return result;
    }

}

public class Solution {

    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        char result = Result.maximumOccurringCharacter(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

*/