public class TestImprovedStack {
	
	public static void main(String[] args) {
	  TestImprovedStack testImprovedStack = new TestImprovedStack();
	  testImprovedStack.launch();
    }

    public void launch() {
	  List newList = new ArrayList();
    	ImprovedStack firstStack = new ImprovedStackImpl(newList);
	  testStack(firstStack);
	  List newList2 = new LinkedList();
    	ImprovedStack secondStack = new ImprovedStackImpl(newList2);
	  testStack(secondStack);
	  
	  
    }

    private void testStack(ImprovedStack stack) {
    	System.out.println("");
    	System.out.println("Testing the stack..."); 
    	stack.push("three");
	  	stack.push("three");
	  	stack.push("four");
	  	stack.push("three");
	  	stack.push("three");
	  	stack.push("seven");
	  	stack.push("eight");
	  	stack.push("nine");

	  	System.out.println(stack.top().getReturnValue());
	  	System.out.println(stack.reverse().top().getReturnValue());
	  	System.out.println(stack.size());
	  	stack.remove("three");
	  	System.out.println(stack.size());
	  	System.out.println(stack.top().getReturnValue());
	  	System.out.println(stack.top().getReturnValue());
    	System.out.println(stack.top().getReturnValue());
    	System.out.println(stack.top().getReturnValue());
    	System.out.println(stack.top().getReturnValue());
    	System.out.println(stack.top().getReturnValue());
	}
    

}