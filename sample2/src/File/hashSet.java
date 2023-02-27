package File;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> pn=new HashSet<>();
		pn.add(2);
		pn.add(6);
		pn.add(5);
		System.out.println("HashSet PrimeNumber: "+pn);
		HashSet<Integer>on=new HashSet<>();
		on.add(3);
		on.add(5);
		on.add(7);
		System.out.println("HashSet OddNumber: "+on);
		pn.retainAll(on);
		System.out.println("Different: "+pn);
	}

}
