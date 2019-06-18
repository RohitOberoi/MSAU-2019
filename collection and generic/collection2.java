package practice;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class collection2 {
	public static void main(String arf[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		SortedMap<Character,Integer>m=new TreeMap<>();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			int count;
			
			char c=s.charAt(i);
			if(c==' ')
				continue;
			if(m.containsKey(c))
				count=m.get(c)+1;
			else
				count=1;
			m.put(c,count);
		}
		for(SortedMap.Entry<Character,Integer> e : m.entrySet())
		{
			System.out.print(e.getKey()+"   ");
			for(int i=0;i<e.getValue();i++)
				System.out.print("#");
			System.out.println("");
		}
	}
}
