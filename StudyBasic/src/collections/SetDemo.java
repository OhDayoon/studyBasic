package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(2); // 2�� �ߺ��Ǿ���.
		A.add(2);
		A.add(2);
		A.add(3);
		// set�̹Ƿ� �ߺ��� ���� ���� �ʱ⶧���� �ѹ��� ���� �ȴ�.
		// ArrayList���ٸ� �ߺ��� ���ǹǷ� 2�� ���� ��� ��� ���̴�.
		
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
		// containsAll : ��ü�� ����ִ��� 
		// A���� 1,2,3 B�� 3,4,5 : A�ȿ� B�� �Ϻΰ� ����ֱ�� ������ ��ü�� ������� �ʴ�.
		System.out.println(A.containsAll(C)); //true
		// A�ȿ� C�� ��ü�� ����ִ�.
		
		A.addAll(B); // A�� B�� ������
		
		hi = (Iterator)A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		A.retainAll(B); // A�� B�� ������
		A.removeAll(B); // A���� B�� �� ������

	}

}
