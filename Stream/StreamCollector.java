package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {
	
	public static void main(String[]args)
	{
		List<Integer>list=Arrays.asList(3,45,6,7,8);
		Stream<Integer>s=list.stream();
		List evennumberlist=s.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(evennumberlist);
		
	}

}
