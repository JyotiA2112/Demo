// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Demo {
    public String solution(int A, int B) {
        // write your code in Java SE 8
        int counterA = A;
        int counterB = B;
        String TwoConsecutiveA = "aa";
        String TwoConsecutiveB = "bb";
        String OneA = "a";
        String OneB = "b";
        String result = "";
        String lastTwoChars = "";
        String lastOneChars = "";
        
        if(B > A)
        {
         counterA = B;
         counterB = A;
         TwoConsecutiveA = "bb";
         TwoConsecutiveB = "aa";
         OneA = "b";
         OneB = "a";
        }
        
        
        
        for(int i= 0 ;i < A+B ;i++)
        {
            
            if(counterA == 0 && counterB == 0)
            {
                break;
            }
            if(result.length() > 2)
            {
                lastTwoChars = result.substring(result.length() - 2);
                lastOneChars = result.substring(result.length() - 1);
            }
            
             if (lastTwoChars != TwoConsecutiveA)
             {
                
                if(counterA > 1 && lastOneChars != OneA)
                {
                
                result = result.concat(TwoConsecutiveA); 
                counterA = counterA - 2;
                
               
                }
                else if(counterA == 1)
                {
                result = result.concat(OneA); 
                counterA = 0; 
                }
             }
            
            if(lastTwoChars != TwoConsecutiveB)
            {
                 if(counterB > 1 && lastOneChars != OneB)
                {
                    
                   result = result.concat(TwoConsecutiveB); 
                   counterB = counterB - 2;
                }
                else if(counterB == 1)
                {
                   result = result.concat(OneB); 
                   counterB = 0; 
                } 
            }
           
            
            
        }
        
        return result;
        
    }
    
    
    public static void main(String args[])
    {
    	Demo d = new Demo();
    	System.out.println(d.solution(5, 8));
    	System.out.println(d.solution(8, 5));
    }
}