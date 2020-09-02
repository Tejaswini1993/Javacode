import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;



public class CollectionsDemo {
	public static void main(String[] args) {
		HashSet<Object> s =new HashSet<>();
		s.add("teju");
		s.add(25);
		s.add(false);
		s.add(6.3);
		
		List<Object> lst= new ArrayList<>(s);
		for (Object val: lst) {
			System.out.println(val);
			
		}
		System.out.println("Extra :"+lst.getClass());
		System.out.println("================================");
		List<Object> lst1=new ArrayList<>();
		lst1.addAll(s);
		for (Object val : lst1) {
			System.out.println(val);
			
		}
		
		
		
	}

}
