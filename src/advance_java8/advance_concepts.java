package advance_java8;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class advance_concepts {

	public static void main(String[] args)
{
		//saved function inside variable--gives boolean
Predicate<String> filterfish = new Predicate<String>() {
	
	@Override
	public boolean test(String t) {
		
		return t.length()>5;
	}
};	
String[] fishes= {"shark","goldfish","apurva"};
for (String fish : fishes) {
	if (filterfish.test(fish)) {
		System.out.println(fish);
	}
}
//other way stream--is seq of obj
//in functional programming you can give menthod as as parameter to other method
Stream.of(fishes).filter(filterfish).toArray();
}
	}
