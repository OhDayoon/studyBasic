package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(2); // 2가 중복되었다.
		A.add(2);
		A.add(2);
		A.add(3);
		// set이므로 중복된 값은 들어가지 않기때문에 한번만 들어가게 된다.
		// ArrayList였다면 중복이 허용되므로 2의 값이 모두 담길 것이다.
		
		Iterator hi = (Iterator)A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		HashSet<Integer> B = new HashSet<>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); //false
		// containsAll : 전체가 담겨있는지 
		// A에는 1,2,3 B는 3,4,5 : A안에 B가 일부가 들어있기는 하지만 전체가 들어있지 않다.
		System.out.println(A.containsAll(C)); //true
		// A안에 C가 전체가 들어있다.
		
		A.addAll(B); // A와 B의 합집합
		
		hi = (Iterator)A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		A.retainAll(B); // A와 B의 교집합
		A.removeAll(B); // A에서 B를 뺀 차집합

	}

}
