/* https://www.youtube.com/watch?v=DxW7VAsdX0o
	example: Stacks(2, 3).. we have 2 stacks, and each stack has 3 values
	topOfStack = {-1,-1}
	stackData = {0,0,0}
	nextIndex = {1,2,-1} // next available val thats not been set
*/


public class Stacks {
	private int[] topOfStack;
	private int[] stackData;
	private int[] nextIndex;
	private int nextAvailable = 0;
	
	public Stacks(int numStacks, int capacity) {
		topOfStack = new int[numStacks];
		for (int i : topOfStack) {
			topOfStack[i] = -1;
		}
		stackData = new int[capacity];
		nextIndex = new int[capacity];
		for (int i = 0; i < nextIndex.length() - 1; i++) {
			nextIndex[i] = i+1;
		}
		nextIndex[nextIndex.length()-1] = -1; 
	}
	
	public void push(int stack, int value) {
		if (stack <= 0 || stack > topOfStack.length()) {
			throw new IndexOutOfBoundsException();
		}
		if (nextAvailable == 0) return;
		
		int currentIndex = nextAvailable; // cache 
		nextAvailable = nextIndex[currentIndex]; //update the next available index to add a new val (move forward)
		stackData[currentIndex] = value; // set data
		nextIndex[currentIndex] = topOfStack[stack];
		topOfStack[stack] = currentIndex; // make the new val added the head
	}
	
	public int pop(int stack) {
		if (stack <= 0 || stack > topOfStack.length() || topOfStack < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		int currentIndex = topOfStack[stack]; // target
		int value = stackData[currentIndex]; // val to remove
		topOfStack[stack] = nextIndex[currentIndex]; // update head
		nextIndex[currentIndex] = nextAvailable; // mark which index is going to be available next
		nextAvailable = currentIndex; // now, set the removed val at the current index as an available index
		return value;
	}
}
		

		
			
		
		
	