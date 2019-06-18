package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class MyCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		if(arg0>arg1)
			return -1;
		else if(arg0<arg1)
			return 1;
		else
		return 0;
	}
	
}
public class collection3 {
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		Map<Character,Integer>m=new HashMap<>();
		int l= s.length();
		for(int i=0;i<l;i++)
		{
			int count;
			char c=s.charAt(i);
			if(c==' ')
				continue;
			else if(m.containsKey(c))
				count=m.get(c)+1;
			else
				count=1;
			m.put(c,count);
		}
		SortedMap<Integer,List>ma=new TreeMap<>(new MyCompare());
		for(Map.Entry<Character,Integer> e:m.entrySet())
		{
			char c=e.getKey();
			int j=e.getValue();
			if(ma.containsKey(j))
				ma.get(j).add(c);
			else
			{
				List<Character> l1=new ArrayList<>();
				l1.add(c);
				ma.put(j,l1);
			}
		}
		for(Map.Entry< Integer,List> e:ma.entrySet())
		{
			ListIterator itr=  e.getValue().listIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
