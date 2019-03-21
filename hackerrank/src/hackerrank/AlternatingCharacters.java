package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class AlternatingCharacters {

	public static void main(String[] args) {

		// alternatingCharacters("aabba");

		System.out.println(alternatingCharacters("AABABB"));
	}

	private static int alternatingCharacters(String s1) {
		char[] ch = new char[s1.length()];
		int top = -1;
		int count = 0;
		for (char c : s1.toCharArray()) {
			if (top < 0 || c != ch[top]) {
				ch[++top] = c;
			} else {
				count++;
			}

		}
		
		/*char prev=0;
		int count=0;
		for(char c:s1.toCharArray())
		{
			if(c==prev)
			{
				count++;
			}
			else
			{
				prev=c;
			}
		}*/
		return count;

	}
}
