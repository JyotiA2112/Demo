/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        CandidateCode c = new CandidateCode();
        c.execute(args);



    	//Write code here

   }

	private void execute(String args[]) {
		int myInt = Integer.valueOf(args[0]);
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the number of test cases");
		 * 
		 * int myInt = scanner.nextInt(); System.out.println("Testcases is: " + myInt);
		 * String[] arr = new String[myInt]; for(int i=0 ; i < myInt ; i++) {
		 * System.out.println("Enter the test case"); String testcase = scanner.next();
		 * arr[i] = testcase; } scanner.close();
		 */

		Scanner scanner = new Scanner(System.in);
		for(int i=1 ; i < myInt ; i++)
		{
			String testcase = args [i];
			String[] splited = testcase.split(" ");
			int P = Integer.valueOf(splited[0]);
			int N = Integer.valueOf(splited[1]);
			int D = Integer.valueOf(splited[2]);
			
			int result = P + (N * (D - 1)); 
			System.out.println(result);
			
		}
		
	}
}
