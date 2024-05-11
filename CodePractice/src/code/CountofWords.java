package code;

import java.util.HashSet;
import java.util.Set;

public class CountofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="I love java java programming";
		
		String str[]=sen.split(" ");
		
		Set<String> dupli=new HashSet<>();
		
		for(String ele:str)
		{
			if(!ele.equals(ele+1))
			{
				dupli.add(ele);
			}
		}
		System.out.println(dupli);

	}

}
