package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> hm=new HashMap<>();
		
		hm.put("Ram", 10);
		hm.put("Hiya",20);
		hm.put("Raju",30);
		hm.put("Mani",40 );
		hm.put("Sani",50);
		
		Iterator<Map.Entry<String,Integer>> it= hm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Integer> em=it.next();
			System.out.println(em.getKey()+" "+em.getValue());
			
		}
		

	}

}
