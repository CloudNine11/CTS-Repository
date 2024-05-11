package code;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Starring";
		
		HashSet<Character> hm=new HashSet<>();
		
		StringBuilder sb=new StringBuilder(str.length());
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(hm.add(ch))
			{
				sb.append(ch);
			}
		}
		
		System.out.println(sb.toString());
		
		
		
		
		
	}

}
