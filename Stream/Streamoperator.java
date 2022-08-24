package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamoperator {

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("jav","c++","python","Datscience");
		Stream<String>s=list.stream();
		s.filter(s1->s1.startsWith("D")).forEach(System.out::println);
		s.filter(s1->s1.startsWith("D")).map(String::toUpperCase).forEach(System.out::println);//this is map methods
		
		
	}

}
