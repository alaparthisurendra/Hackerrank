package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SherlockValidString {
	
	public static void main(String[] args) {
		//String s="acda";
		SherlockValidString sherlock=new SherlockValidString();
		System.out.println(sherlock.isvalid("aabcce"));
		//sherlock.isvalid("abc");
	}

	private String isvalid(String s) {
		Map<Character, Integer> hashMap=new HashMap<>();
		int count=0;
		String result="yes";
		char[] c=s.toCharArray();
		for (char ch : c) {
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
			
		}
		Integer current_value=0;
		for(Map.Entry<Character, Integer> hashmapCount: hashMap.entrySet())
		{
			if(current_value==0)
			{
				current_value = hashmapCount.getValue();
			}
			else
			{
				int difference=Math.abs(current_value-hashmapCount.getValue());
				System.out.println(difference);
				if(hashmapCount.getValue()>1 && difference >0)
				{
					count+=difference;
				}
				else if(hashmapCount.getValue()==1 && difference >0)
				{
					count++;
				}
			}
		}
		if(count > 1){
            result = "NO";
        }
		return result;
		
		
		 /*int current = 0;
	        for (Map.Entry<Character, Integer> hmapcount : hashMap.entrySet()){
	            if(current == 0){
	                current = hmapcount.getValue();
	                System.out.println(hmapcount.getValue());
	                System.out.println("current:"+current);
	            }else{
	                int diff = Math.abs(current - hmapcount.getValue());
	                System.out.println("diff:"+diff);
	                if(hmapcount.getValue() > 1 && diff > 0){
	                	count += diff;
	                }else if(hmapcount.getValue() == 1 && diff > 0){
	                	count++;
	                }
	            }
	        }
	        if(count > 1){
	            result = "NO";
	        }
	        return result;*/

}
}
