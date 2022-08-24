package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamcountMethod {

	public static void main(String[] args) {
	List<String>list=Arrays.asList("hai","hello","howru","Welcome");
	
	long count=list.stream().filter(s->s.startsWith("h")).count();
	System.out.println(count);

	}

}
