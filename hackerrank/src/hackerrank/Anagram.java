package hackerrank;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	//	System.out.println(anagram("cde","abc"));
		
		System.out.println(anagram("showman","woman"));

	}

	private static int anagram(String s1, String s2) {
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch1);
		for(char c:ch1) {
			System.out.println(c);
		}
	
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
		}
		int count=-1;
		
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=0; j< ch2.length; j++)
			{
				if(ch1[i]!=ch2[j] && (i!=j))
				{
			     count++;
				}
				
			}
		}
		return count;
		
	
	}

}
