import java.util.*; 

public String compress(String a) {
	StringBuilder sb=new StringBuilder();
	HashSet<Character> hs=new HashSet<Character>(); //Stores a unique entry for each character
	for(int i=0;i<a.length();i++)
		if(!hs.contains(a.charAt(i)))
		{
			sb.append(a.charAt(i));
			hs.add(a.charAt(i));
		}
	return sb.toString();
  }
==========================================

import java.util.*; 

/* 
Loop over the characters, from the 2nd till the end
If the current character is the same as the previous, increment the count
If different, append the count and append the previous character
After the end of the loop, append the count
*/

public class Main {
  public static void main(String[] args) {
    String s = compress("aabccc");
    System.out.println(s);
  }
public static String compress(String str) {
    if (str.isEmpty()) {
        return "";
    }

    char[] chars = str.toCharArray();
    StringBuilder builder = new StringBuilder();

    int count = 1;
    char prev = chars[0];
    for (int i = 1; i < chars.length; i++) {
        char current = chars[i];
        if (current == prev) {
            count++;
        } else {
            builder.append(prev).append(count);
            count = 1;
        }
        prev = current;
    }
    return builder.append(prev).append(count).toString();
}
}