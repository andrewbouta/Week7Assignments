import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class JobQueue {
    private int numWorkers;
    private int[] jobs;

    private int[] assignedWorker;
    private long[] startTime;

    private FastScanner in;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new JobQueue().solve();
    }

    private void readData() throws IOException {
        numWorkers = in.nextInt();
        int m = in.nextInt();
        jobs = new int[m];
        for (int i = 0; i < m; ++i) {
            jobs[i] = in.nextInt();
        }
    }

    private void writeResponse() {
        for (int i = 0; i < jobs.length; ++i) {
            out.println(assignedWorker[i] + " " + startTime[i]);
        }
    }

    private void assignJobs() {
    	
    	/*
    	 * One loop? Rather than a nested for loop, use First for loop
    	 * Build a queue, threads are stored
    	 * Priority queue should figure out which thread is available to work
    	 * This is sorted by free time.
    	*/
    	
    	 PriorityQueue<Integer> jobs = new PriorityQueue<>();
		 assignedWorker = new int[jobs.size()];	// Workers are the threads
		 startTime = new long[jobs.size()];		 
		 long[] nextFreeTime = new long[numWorkers];
		
		 for (int i = 0; i < jobs.size(); i++) {	// loop for each job to see who is available
		     int duration = jobs[i];				// find the duration of each.. 1st: 1s; 2nd: 2s etc.
		     int bestWorker = 0;
		 }
   
    	
    	
    	/*
        // TODO: replace this code with a faster algorithm.
        assignedWorker = new int[jobs.length];	// Workers are the threads
        startTime = new long[jobs.length];		 
        long[] nextFreeTime = new long[numWorkers];
        for (int i = 0; i < jobs.length; i++) { // loop for each job to see who is available
            int duration = jobs[i];				// find the duration of each.. 1st: 1s; 2nd: 2s etc.
            int bestWorker = 0;
            for (int j = 0; j < numWorkers; ++j) { // Find out who is available 
            	
            	// Check 2 threads to see who has the best time\
            	// Then updates info
            	// Time complexity O(n*
                if (nextFreeTime[j] < nextFreeTime[bestWorker]) 
                    bestWorker = j;
            }
            assignedWorker[i] = bestWorker;
            startTime[i] = nextFreeTime[bestWorker];
            nextFreeTime[bestWorker] += duration; // Thread 0's time changes, then second loop starts
        }
        */ 
        
    }
    
    // nextFreeTime[0] = 1;
    // nextFreeTime[1] = 0; 
    public void solve() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        readData();
        assignJobs();
        writeResponse();
        out.close();
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
