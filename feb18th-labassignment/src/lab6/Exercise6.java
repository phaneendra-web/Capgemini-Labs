package lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise6 {
	public static List<Integer> votersList(Map<Integer,Integer> map){
		//Collection<Integer> m=map.values();
		List<Integer> lis=new ArrayList();
		for(Integer i: map.values()) {
			if(i>=18) {
				for(Entry<Integer, Integer> n:map.entrySet()) {
					if(n.getValue()==i) {
						lis.add(n.getKey());
					}
					
				}
				
			}
		}
		return lis;
		
	}
	
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap();
		map.put(1, 17);
		map.put(4, 20);
		map.put(5, 9);
		map.put(56, 40);
		System.out.println(votersList(map));
	}

}
