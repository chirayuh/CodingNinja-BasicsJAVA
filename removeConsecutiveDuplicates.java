/*
For a given string(str), remove all the consecutive duplicate characters.
*/

public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		String result="";
		char ch1='a',ch2='a';
		for(int i=0;i<str.length()-1;i++)
		{
			ch1=str.charAt(i);
			ch2=str.charAt(i+1);
			if(ch1==ch2)
			{
				continue;
			}
			else
			{
				result+=ch1;
			}
		}
		result+=ch2;
		return result;
	}

}