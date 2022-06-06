import java.util.Stack;

public class Stk{
	public static void main(String args[]){
		Stack<Integer> stk = new Stack<Integer>();
		boolean result = stk.empty();
		
		System.out.println("Is stack empty: "+result);
		
		stk.push(67);
		stk.push(46);
		stk.push(34);
		
		System.out.println("\nStack Elements: "+stk);
		System.out.println("\nTop of the stack: "+stk.peek());
		
		
		result = stk.empty();
		
		System.out.println("\nIs stack empty: "+result);
		
		Integer x =(Integer)stk.pop();
		
		System.out.println("\nPopped value: "+x);
		
		x =(Integer)stk.pop();
		
		System.out.println("Popped value: "+x);
		
		x =(Integer)stk.pop();
		
		System.out.println("Popped value: "+x);
		
		result = stk.empty();
		
		System.out.println("\nIs stack empty: "+result);
		
		
		
	}
}