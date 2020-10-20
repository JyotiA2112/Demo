import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	Arrays.sort(ar);
    	
    	//10 20 20 10 10 30 50 10 20
    	//10 10 10 10 20 20 20 30 50
    	
    	int count = 1;
    	int result = 0;
    	for(int i= 0 ; i< n ; i++)
    	{
    		
    		int value = ar[i];
    		//map.put(value, count);
    		if(!map.containsKey(value))
			{
    			count = 1;
				map.put(value, count);
			}
    		
    		if(i != n-1&& ar[i] == ar[i+1])
    		{
    			count = count + 1;
    			map.put(ar[i+1], count);    			
    		
    		}
    			
    		
    		
    		
    	}
    	
    	for(Integer value  : map.values())
    	{
    		if(value > 1)
    		{
    			
    			result = result + value/2;
    		}
    	}
    	
    	System.out.print(map);
    	
		return result;

        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
