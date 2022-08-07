
public class Stack {
	//if top = -1, then the stack is empty
	int top = -1;
	
	int stack[];
	
	
	//Define the stack size here
	void stackSize(int num) {
		//initialize array to preffered size
		stack = new int[num];
		System.out.println("The stack size is: "+stack.length);
		
	}
	
	//inserting into a stack
	public int push(int num) throws ArrayIndexOutOfBoundsException{
		top = top + 1;
		
		if(top >= stack.length) {
			System.out.println("Stack is full");
		
		}else {
		stack[top] = num;
		System.out.println("pushed "+stack[top]);
		}
		return 0;
	}
	
	public int pop() {
		
		
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
		System.out.println("popped " + stack[top]);
		top = top - 1;
		
		}
		
		return 0;
	}
	
	int peek() {
		
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		System.out.println(stack[top]);
		
		
		
		return 0;
	}
	int isFull() {
		
	if(top < stack.length - 1) {
		
		System.out.println("Not yet full my friend");
	}
	else {
		System.out.println("Very much my friend");
	}
		
		return 0;
	}
	
	int isEmpty() {
		
		if(top == -1 ) {
			System.out.println("Stack is empty");
			
		}
		else {
			System.out.println("No, some elements are there");
		}
		
		return 0;
	}
	
	
	
	public static void main(String args[]) {
		
		Stack s1 = new Stack();
		
		s1.stackSize(5);
		//s1.push(4);
		//s1.push(6);
		//s1.push(4);
		//s1.push(4);
		//s1.push(9);
		//s1.pop();
		//s1.pop();
		//s1.pop();
		//s1.pop();
		//s1.pop();
		//s1.pop();
	
		//s1.peek();
		s1.isFull();
		s1.isEmpty();
		
	}

}
