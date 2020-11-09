class Result {

    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */
     
     int charCount = 0;
     int temp = 0;

    public char maximumOccurringCharacter() {
    // Write your code here
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        
        char x = ' ', y = ' '; // x is character to return, y is temporary char
        int prevCharVal = 0, currCharVal = 0;
        
        for (int i = 0; i < text.length(); i++) {
            y = text.charAt(i); // char at 0, checks for the first char at index 0;
            charCount = 1;
            for (int j = i + 1; j < text.length(); j++) { // 
                if (y == text.charAt(j)) {
                    charCount++;
                }
            }
            if(prevCharVal < charCount) { // checks if the character iterated first (before) the 
                x = y;
                prevCharVal = charCount;
            }         
        }
                
        if (text == null || text.isEmpty()) {
            System.out.println("Please enter text to be tested.");
        }
        return x;         
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