/*
For a given input string(str), write a function to print all the possible substrings.
*/

 public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		char ch='a';
		for(int k=1;k<=str.length();k++)
		{
			for(int i=0;i<str.length();i++)
			{
				for(int j=i;j<=k-1;j++)
				{
					ch=str.charAt(j);
					System.out.print(ch);
				}
				System.out.println();
			}
		}
		
	}

}