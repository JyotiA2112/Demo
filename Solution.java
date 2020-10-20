class Solution {
	
	//code to check if it is possible to build a certain pattern with the givenumber of input -
	//Pattern - 
	
    public String solution(int[] A) {
        // write your code in Java SE 8
        int[] count = new int[12];
        int element1 = 0; 
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;
        int finalcount = 0;
        
        for(int i = 0 ; i< A.length ; i++)
        {
            count[A[i]] = count[A[i]]  + 1;
            
            
        }
        
        for(int i = 0 ; i< count.length ; i++)
        {
            if(count[i] >= 3)
            {
                element1 = i;
                count1 = count[i];
                count[i]= 0;
                break;
            }
        }
        
        for(int i = 0 ; i< count.length ; i++)
        {
            if(count[i] >= 3)
            {
                element2 = i;
                count2 = count[i];
                count[i]= 0;
                break;
            }
        }
        for(int i = 0 ; i< A.length - 1 ; i=i+2)
        {
            if(A[i] == element1 && A[i+1] == element2)
            {
                finalcount = finalcount + 1;
            }
            else if(A[i] == element2 && A[i+1] == element1)
            {
                finalcount = finalcount + 1;
            }
        }
        
        if(finalcount >= 2)
        {
            if(count1 - finalcount > 0 && count2 - finalcount > 0)
            {
                return "YES";
            }
            else
            {
            return "NO";
             }
            
        }
        else
        {
            return "NO";
        }
        
    }
}