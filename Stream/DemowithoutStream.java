package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DemowithoutStream {
	

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();//	List<String>list=new ArrayList<String>()
		list.add("Java");
		list.add("Java");
		list.add("Java");
		list.add("Java");
		int count=0;
		for(String s:list)
		{
			if(s.length()<6)
			{
				count++;
			}
		}
		System.out.println("====================================================================");
		long count1=list.stream().filter(str->length()<6).count();
		System.out.println("the lessthan  6 length"+count);
		
		

	}

}
