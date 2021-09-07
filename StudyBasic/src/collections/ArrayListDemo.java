package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0]="one";
		arrayObj[1]="two";
		// arrayObj[2]="three"; // 크기가 달라 오류가 발생한다.
		for(int i=0;i<arrayObj.length;i++) {
			System.out.println(arrayObj[i]);
		}
		
		// ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();
		al.add("one"); // arrayList의 add는 어떠한 형태도 받아들일 수 있다.
						// add안에 들어가야할 변수의 타입은 object형이어야 한다.
		al.add("two");
		al.add("three");
		
		for(int i=0;i<al.size();i++) {
			String val = (String)al.get(i); // 리스트 타입을 따로 정해주지 않아서 object 타입을 스트링타입으로 지정해준다.
											// 만약 ArrayList<String> al = new ArrayList<>();을 하면 현재 val값에서 String으로 형변환 하지 않아도 된다.
			System.out.println(val);
		}
		// 컬렉션즈 프레임워크
		/*
		  	collection과 Map이 최상위 카테고리가 된다.
		  	1. Collection
		  		1) Set - HashSet, LinkedHashSet, TreeSet
		  		2) List - ArrayList, Vector, LinkedList
		  		3) Queue - PriorityQueue
		  		
		  		List는 중복되는 값이 들어갈 수 있지만 Set 경우에는 중복되는 값이 들어가면 안된다.
		  		즉 , List는 중복을 허용하고 Set은 허용하지 않는다.
		  		
		  	2. Map
		  	   : 키, 벨루의 값이 있다. 
		  		1) SortedMap - TreeMap
		  		2) Hashtable
		  		3) LinkedHashMap
		  		4) HashMap
		  		 
		  
		  
		 */
	}

}
