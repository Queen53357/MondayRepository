package allconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class firstall {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Susmi");
		l1.add("Prem");
		l1.add("sumi");
		l1.add("Hari");
		l1.add("Sumi");
		
		
		l1.stream().filter(k->k.matches("Sumi"))
		.forEach(System.out::println);
		System.out.println("The limits values---");
		List<String> limits=l1.stream().limit(4).collect(Collectors.toList());
		limits.forEach(values->System.out.println(values));
		
	}

}
