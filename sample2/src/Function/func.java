package Function;

import java.util.function.Function;

public class func {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Function<Integer, Long> f1=a->new Long(a*5-a+2/a%6);
		System.out.println("Print: "+f1.apply(300));
	}

}
