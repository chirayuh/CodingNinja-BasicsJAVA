/*
For a given a string(str), find and return the highest occurring character.
*/

import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		char result='\0';
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		int max=0;
		for(char ch: map.keySet())
		{
			if(map.get(ch)>max)
			{
				max=map.get(ch);
				result=ch;
			}
		}
		return result;
	}

}