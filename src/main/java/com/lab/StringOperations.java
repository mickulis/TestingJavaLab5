package com.lab;

import java.util.ArrayList;
import java.util.List;

public class StringOperations
{

	public String reverse(String a)
	{
		List<String> tempArray = new ArrayList<String>(a.length());
		for (int i = 0; i < a.length(); i++)
		{
			tempArray.add(a.substring(i, i + 1));
		}
		StringBuilder reversedString = new StringBuilder(a.length());
		for (int i = tempArray.size() - 1; i >= 0; i--)
		{
			reversedString.append(tempArray.get(i));
		}
		return reversedString.toString();
	}

	public String concat(String a, String b)
	{
		if(a == null) return b;
		if(b == null) return a;

		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		return sb.toString();
	}

	public boolean isPalindrome(String a)
	{
		if (a.length() <= 1)
		{
			return true;
		}
		if (!(a.charAt(1) + "").equals(a.charAt(a.length() - 1) + ""))
		{
			return false;
		}
		return isPalindrome(a.substring(1, a.length() - 2));
	}

}