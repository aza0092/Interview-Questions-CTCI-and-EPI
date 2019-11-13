// https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution
// on, on
// https://www.youtube.com/watch?v=CCyEXcNamC4

public boolean isValid(String parantheses) {
	if (parantheses.length() % 2 == 1) return false;
	
	Stack<Character> stack = new Stack<Character>();
	char[] chars = parantheses.toCharArray();
	for (char c : chars) {
		if (c == '(') 
			stack.push(')');
		else if (c == '[') 
			stack.push(']');
		else if (c == '{')
			stack.push('}');
		
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}