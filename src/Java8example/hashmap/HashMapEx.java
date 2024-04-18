package Java8example.hashmap;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String , Integer> hm = new HashMap<>();
		
		Map<String , Integer> hm1 = new HashMap<>();
		
		
		hm.put("Manoj", 1);
		hm.put("Dinesh", 2);
		hm.put("Shiva", 3);
		
		
		hm1.put("Manoj1", 11);
		hm1.put("Dinesh", 22);
		hm1.put("Shiva3", 33);
	
	System.out.println(hm);
	
	System.out.println(hm1.equals(hm));
	
	System.out.println("The hashcode of hm is " + hm.hashCode());
	
	System.out.println("The hashcode of hm1 is " + hm1.hashCode());
	}

}
