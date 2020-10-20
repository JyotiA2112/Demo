
/*Dart Scoring
Write a scoring function for the darts game 301.


Game Rules
The player's score starts at 301. Darts are thrown in rounds of three. Each round's score is removed from the player's total until it is exactly zero.


Players must "double-in" and "double-out": any darts thrown before a double is scored are ignored, and only a double can bring the total to zero.


If the total arrives at 1, a negative number, or zero but not via a double, the player is bust and the total from the previous round is maintained. (Any superfluous throws in a bust round will be recorded as zeroes.)


Instructions
You are provided an array of dart throws. Write a function to return the current score as a number from 301 (a scoreless game) to 0 (a winning condition) or any number in between (a game in progress). You may assume that the input is well-formed and valid.


Dart throws are represented as the following strings:
Singles: "1"-"20" (worth 1-20), "SB" (worth 25)
Doubles: "D1"-"D20" (worth 2-40), "DB" (worth 50)
Triples: "T1"-"T20" (worth 3-60)
Sample Input:
["D20", "T20", "T20", "T20", "T10", "1"]-- 50

 ["D10", "T2", "18", "17", "D19", "5"] -- 197
["D20", "T20", "T20", "T20", "T10", "1", "T17"] -- 50
["D20", "T20", "T20", "T20", "T10", "1", "11"] -- 39

["D20", "T20", "T20", "T20", "T10", "1", "D16","17"] -- 18
["17", "T2", "17", "18", "17", "D19", "5"] -- 258
["D20", "T20", "T20", "T20", "T10", "1", "DB"]--  0
["D20", "T20", "T20", "T20", "T10", "1", "T10", "D10"]-- 0 
["D20", "T20", "T20", "T20", "T10", "1","20","5","SB"] -- 25
["D20", "T20", "T20", "T20", "T10", "1","20","4","1","SB"]--25

*
*/




public class Optum {
	
	public static void main(String args[])
	{
		String[] arr = {"D20", "T20", "T20", "T20", "T10", "1"} ;
		Optum o = new Optum();
		int finalOutput = o.method(arr);
		System.out.println(finalOutput);
		
	}

	private int method(String[] arr) {
		// TODO Auto-generated method stub
		int result = 301;
		int finalresult = 0;
		boolean gameStarted = false;
		for(int i = 0; i < arr.length ; i ++)
		{
			String value = arr[i];
			if(!gameStarted)
			{
				if(value.startsWith("D"))
				{
					gameStarted = true;
				}
				
			}
			
			if(gameStarted)
			{
				if(value.startsWith("D"))
				{
					if(value == "DB")
					{
						result = result - 50;
						if(result == 0)
						{
							System.out.println("User has won as output is 0 via double");
							
							return 0;
						}
					}
					else
					{
						String substr = value.substring(1, value.length());
						result = result - (Integer.valueOf(substr)*2);
						if(result == 0)
						{
							System.out.println("User has won as output is 0 via double");
						
						return 0;
						}
					}
					
					
					
				}
				else if(value.startsWith("T"))
				{

					String substr = value.substring(1, value.length());
					int tempresult = result - (Integer.valueOf(substr)*3);
					if(tempresult != 0 && tempresult > 0)
					{
						result = tempresult;
					}
					
					
				
				}
				else
				{
					if(value == "SB")
					{
						result = result - 25;
					}
					else
					{
						int tempresult = result -  Integer.valueOf(value);
						if(tempresult != 0 && tempresult > 0)
						{
							result = tempresult;
						}
					}
					
					
				}
				if(result > 1)
				{
					finalresult = result;
				}
				
				
			}
		}
		return finalresult;
		
	}
	
	
	
	
	
	

}
