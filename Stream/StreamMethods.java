package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		
		Stream<Integer>stream=Stream.of(new Integer[] {1,2,3,4,5,6,7,8});
		stream.forEach(p-> System.out.println(p));
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
		Stream s=list.stream();
		s.forEach(p->System.out.println(p));
		
	}

}
