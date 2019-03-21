package hackerrank;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		//beautifulBinaryString("010010");
		System.out.println(beautifulBinaryString("0100"));

	}

	private static int beautifulBinaryString(String str) {
		int value=0;
		for(int i=0; i< str.length()-2; i++)
		{
			if(str.charAt(i)=='0' && str.charAt(i+1)=='1' && str.charAt(i+2)=='0')
			{
				value++;
				i+=2;
			}
		}
		return value;
		
	}

}
