

	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class JumpingOnTheClouds {

	    // Complete the jumpingOnClouds function below.
	    static int jumpingOnClouds(int[] a) {
	    	
	    	int result = 0;
	    	
	    	//0 0 1 0 0 1 0
	    	for(int i =0 ; i < a.length - 1  ;i ++)
	    	{
	    		if(i < a.length - 2 && a[i+2] == 0)
	    		{
	    			
	    			i = i+1;
	    		}
	    		
	    		result ++;
	    	}

	    	return result;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] c = new int[n];

	        String[] cItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }

	        int result = jumpingOnClouds(c);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}



