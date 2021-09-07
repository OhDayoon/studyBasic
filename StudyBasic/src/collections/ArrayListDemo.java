package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0]="one";
		arrayObj[1]="two";
		// arrayObj[2]="three"; // ũ�Ⱑ �޶� ������ �߻��Ѵ�.
		for(int i=0;i<arrayObj.length;i++) {
			System.out.println(arrayObj[i]);
		}
		
		// ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();
		al.add("one"); // arrayList�� add�� ��� ���µ� �޾Ƶ��� �� �ִ�.
						// add�ȿ� ������ ������ Ÿ���� object���̾�� �Ѵ�.
		al.add("two");
		al.add("three");
		
		for(int i=0;i<al.size();i++) {
			String val = (String)al.get(i); // ����Ʈ Ÿ���� ���� �������� �ʾƼ� object Ÿ���� ��Ʈ��Ÿ������ �������ش�.
											// ���� ArrayList<String> al = new ArrayList<>();�� �ϸ� ���� val������ String���� ����ȯ ���� �ʾƵ� �ȴ�.
			System.out.println(val);
		}
		// �÷����� �����ӿ�ũ
		/*
		  	collection�� Map�� �ֻ��� ī�װ��� �ȴ�.
		  	1. Collection
		  		1) Set - HashSet, LinkedHashSet, TreeSet
		  		2) List - ArrayList, Vector, LinkedList
		  		3) Queue - PriorityQueue
		  		
		  		List�� �ߺ��Ǵ� ���� �� �� ������ Set ��쿡�� �ߺ��Ǵ� ���� ���� �ȵȴ�.
		  		�� , List�� �ߺ��� ����ϰ� Set�� ������� �ʴ´�.
		  		
		  	2. Map
		  	   : Ű, ������ ���� �ִ�. 
		  		1) SortedMap - TreeMap
		  		2) Hashtable
		  		3) LinkedHashMap
		  		4) HashMap
		  		 
		  
		  
		 */
	}

}
