// https://leetcode.com/problems/reverse-words-in-a-string/submissions/
// on, on 

public class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" "); // each word will be stored in a single index, [the], [sky]
        StringBuilder sb = new StringBuilder();
        int end = words.length;
        for(int i = 0; i< end; i++){
            if(!words[i].isEmpty()) { // an input may have two or more spaces, so we check to not add a space
                sb.insert(0, words[i]); // push a new word at the beggining of the sb
                if(i < end) sb.insert(0, " "); // insert space at beginning so that theres a space between the old and the new word added, no space when last word is added
            }
        }
        return sb.toString();
    }
}