package code;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Geekpooo";
	
		
		char[] arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

		
	}

}
