import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BuildHeap {
    private int[] data;
    // static final int x = data.length;
    private List<Swap> swaps;

    private FastScanner in;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new BuildHeap().solve();
    }

    private void readData() throws IOException {
        int n = in.nextInt(); 			// Assign nextInt value to n
        data = new int[n];				// Data var created for array 
        for (int i = 0; i < n; ++i) {	// looping through each value
          data[i] = in.nextInt();
        }
    }

    private void writeResponse() {
        out.println(swaps.size());
        for (Swap swap : swaps) {
          out.println(swap.index1 + " " + swap.index2);
        }
    }

    private void generateSwaps() {
      swaps = new ArrayList<Swap>(); // Resizable array

      // data = X elements
      // First For loop = i = starting point of array .. 0
      // Second For loop = j =
      
      // 5 4 3 2 1	i
      // 5 4 3 2 1	j
      
      // 4 5 3 2 1 	i
      // 3 5 4 2 1 	j
      
      // 2 5 4 3 1	i
      // 1 5 4 3 2 	j
      
      /* The following naive implementation just sorts 
      the given sequence using selection sort algorithm
      and saves the resulting sequence of swaps.
      This turns the given array into a heap, 
      but in the worst case gives a quadratic number of swaps.
     */
     
     // TODO: replace by a more efficient implementation
     for (int i = 0; i < data.length; ++i) {
       for (int j = i + 1; j < data.length; ++j) {
         if (data[i] > data[j]) {
           swaps.add(new Swap(i, j));
           int tmp = data[i];		// assigning i to tmp var
           data[i] = data[j]; 		// assigning j's value to i
           data[j] = tmp; 			// assigning value of i (from tmp) to j
         }
       }
     } 
 
      }
    	
    
    
    
    // Builds the min heap
    private void minHeap() {
    	swaps = new ArrayList<Swap>(); // Resizable array
    	int i = data.length;
    	
    	// the position 
    	for (int x = i/2; x >= 1; x--) {
    		minHeap(x);
    	}
    	
    
    	
    }
    
    // Selects a value of a node and moves it down the tree (trades places with child node who's value is smallest)
    private void minHeap(int position) {
    	int x = position; // var x set to position
    	int left = 2 * position;
    	int right = (2 * position) + 1;
    	
    	
    	while (position != x) {
    		
    		// comparison between left and right child, trades smallest child with the parent
	    	if(data[left] < data[x]) 
	    		x = left;
	    	if(data[right] < data[x])
	    		x = right;
	    	
    		swaps.add(new Swap(position, x));
    		
    		// swaps positions of the values
    		int tmp = data[position];
    		data[position] = data[x];
    		data[x] = tmp;
    		minHeap(x);
    	}
    }
      
      


    public void solve() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        readData();
        generateSwaps();
        minHeap();
        writeResponse();
        out.close();
    }

    static class Swap {
        int index1;
        int index2;

        public Swap(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }
    }

    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
