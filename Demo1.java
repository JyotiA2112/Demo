import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;
import java.util.TreeMap;

public class Demo1 {
	
	public static void main(String arg[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the first number");
		String str1 = br.readLine();
		System.out.println("Enetr the second number");
		String str2 = br.readLine();
		
		int a = Integer.valueOf(str1) + Integer.valueOf(str2);
		System.out.println("Sum is"+ a);
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "red");
		map.put(2,"blue");
		map.put(3,"green");
		Map<Integer,String> map1 = new TreeMap<Integer,String>();
		map1.put(1, "apple");
		map1.put(3,"grapes");
		map1.put(2,"banana");
		map1.put(0, "green");
		
		for(Map.Entry entry : map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		if(map.containsValue("green") && map1.containsValue("green"))
		{
			System.out.println("Both have value");
		}
		System.out.println(map1);
		
		Set<String> set = new TreeSet<String>();
		set.add("banana");
		set.add("apple");
		set.add("apple");
		System.out.println(set);
		
		
	}

}
