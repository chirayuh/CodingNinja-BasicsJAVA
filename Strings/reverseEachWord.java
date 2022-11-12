/*
Aadil has been provided with a sentence in the form of a string as a function parameter. 
The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
*/

public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
		String word="",result="";
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				word=ch+word;
			}
			else
			{
				result=result+word+" ";
				word="";
			}
		}
		return result;
	}

}