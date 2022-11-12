/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
*/

import java.util.*;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		str1=String.valueOf(ch1);
		str2=String.valueOf(ch2);
		return str1.equals(str2);
	}

}