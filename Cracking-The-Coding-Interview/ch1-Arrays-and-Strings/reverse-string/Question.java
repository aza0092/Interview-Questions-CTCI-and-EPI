// https://leetcode.com/problems/reverse-string/discuss/80937/JAVA-Simple-and-Clean-with-Explanations-6-Solutions
// On, On.. can be solved with o1 space if the input is char not string

class Solution {
    public void reverseString(char[] s) {
		if (s == null) {
            throw new IllegalArgumentException("String cannot be null!");
        }
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }

        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char holdCurrValue = s[start];
            s[start] = s[end];
            s[end] = holdCurrValue;
            start++;
            end--;
        }        
    }
}