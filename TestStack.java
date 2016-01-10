public class TestStack {
	
	public static void main(String[] args) {
	  TestStack testStack = new TestStack();
	  testStack.launch();
    }

    public void launch() {
	  List newList = new ArrayList();
    	Stack firstStack = new StackImpl(newList);
	  testStack(firstStack);
	  List newList2 = new LinkedList();
    	Stack secondStack = new StackImpl(newList2);
	  testStack(secondStack);
	  
	  
    }

    private void testStack(Stack stack) {

    	System.out.println("");

    	System.out.println("Testing the stack..."); 

    	System.out.print("testing is Empty, should be true: ");
    	System.out.println(stack.isEmpty());
    	System.out.print("testing size, should be 0: ");
    	System.out.println(stack.size());
    	System.out.print("testing top, should be error: ");
    	System.out.println(stack.top().getError());
    	System.out.print("testing pop, should be error: ");
    	System.out.println(stack.pop().getError());

	  	stack.push("one");
	  	System.out.print("testing size, should be 1: ");
	  	System.out.println(stack.size());
		System.out.print("testing is Empty, should be false: ");
	  	System.out.println(stack.isEmpty());
	  	System.out.print("testing pop, should be one: ");
    	System.out.println(stack.pop().getReturnValue());
    	System.out.print("testing size, should be 0: ");
    	System.out.println(stack.size());
    	System.out.print("testing pop, should be error: ");
	  	System.out.println(stack.pop().getError());


	  	stack.push("two");
	  	stack.push("three");
	  	stack.push("four");
	  	stack.push("five");
	  	stack.push("six");
	  	stack.push("seven");
	  	stack.push("eight");
	  	stack.push("nine");
	  	System.out.print("testing size, should be 8: ");
	  	System.out.println(stack.size());
		System.out.print("testing pop, should run doen to 0 and then give error: ");
	  	System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.size());
	  	System.out.println(stack.pop().getReturnValue());
	  	System.out.println(stack.size());
	  	System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.size());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.size());
	  	System.out.println(stack.pop().getReturnValue());
	  	System.out.println(stack.size());
	  	System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.size());
		System.out.println(stack.pop().getReturnValue());
		System.out.println(stack.size());
	  	System.out.println(stack.pop().getReturnValue());
	  	System.out.println(stack.size());
	  	System.out.println(stack.pop().getError());
		System.out.println(stack.size());
	}
    

}