// https://leetcode.com/problems/longest-palindromic-substring/
// DP 0n2, 0n2 https://www.youtube.com/watch?v=0xeBqanD5GQ , https://www.youtube.com/watch?v=onkdOAMS63U
// Approach 4: Expand Around Center: On^2 time, O1 space
// explanation: https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution

public class Solution {
    int begin;
    int max;

    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        for (int i = 0; i < s.length()-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        
        return s.substring(begin, begin + max); //get start and end of palindrome substring
    }
    

    private void extendPalindrome(String s, int lef, int righ) {
        while (lef >= 0 && righ < s.length() && s.charAt(lef) == s.charAt(righ)) {  // Must be inbounds and Equal to continue moving
            lef--;
            righ++;
        }
        if (max < righ-1 - lef) {
            begin = lef+1;           //left+1:  our l-- will go  unequal OR off bounds
            max = righ-1 - lef;    //right-1:  our r++ will go  unequal OR off bounds
        }
    }
    
}
