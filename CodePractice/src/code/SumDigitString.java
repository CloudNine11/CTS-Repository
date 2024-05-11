package code;

public class SumDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc123edf";
	
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
			{
			sum+=str.charAt(i)-'0';
			}
			
		}
		System.out.println(sum);

	}

}
