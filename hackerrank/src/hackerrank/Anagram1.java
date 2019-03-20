package hackerrank;

public class Anagram1 {
	private static int Number_letter = 26;

	public static void main(String[] args) {
		//anagram("showman", "woman");
		System.out.println(anagram("showman", "woman"));

	}

	private static int anagram(String s1, String s2) {
		int[] charcount1 = getCharCount(s1);
		int[] charcount2 = getCharCount(s2);
		System.out.println("charcount1:"+charcount1);
		System.out.println("charcount2:"+charcount2);
		return getData(charcount1, charcount2);

	}

	private static int getData(int[] charcount1, int[] charcount2) {

		if (charcount1.length != charcount2.length) {
			return -1;
		}
		int value=0;
		for(int i=0; i< charcount1.length; i++)
		{
			int difference=Math.abs(charcount1[i]-charcount2[i]);
			System.out.println("difference:"+difference);
			value=value+difference;
			System.out.println("Value:"+value);
		}
		return value;
	}

	private static int[] getCharCount(String s1) {
		int[] charcounts = new int[Number_letter];
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			System.out.println("c:"+c);
			int offset = (int) 'a';
			System.out.println("offset:"+offset);
			int code = c - offset;
			System.out.println("code:"+code);
			charcounts[code]++;
		}
		return charcounts;
	}

}
