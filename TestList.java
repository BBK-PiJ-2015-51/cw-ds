public class TestScript {
	
	public static void main(String[] args) {
	  TestScript testScript = new TestScript();
	  testScript.launch();
    }

    public void launch() {
	  List firstList = new ArrayList();
	  testList(firstList);
	  List secondList = new LinkedList();
	  testList(secondList);
    }

    private void testList(List list) {
	  
	  	System.out.println("");
		System.out.println("Testing the list..."); 

    	
	  	System.out.print("Testing if the list is empty, should return true: ");
	  	System.out.println(list.isEmpty());
	  	System.out.print("Testing the size, should be 0: ");
	  	System.out.println(list.size());
	  	System.out.print("Testing get, should be error: ");
	  	System.out.println(list.get(0).getError());
		System.out.print("Testing get, should be error: ");
	  	System.out.println(list.get(-1).getError());
		System.out.print("Testing get, should be error: ");
	  	System.out.println(list.get(1).getError());
		System.out.print("Testing remove, should get Error: " );
	  	System.out.println(list.remove(0).getError());
	  	System.out.print("Testing the size, should be 0: ");
		System.out.println(list.size());

		System.out.println("");

		System.out.print("Testing adding a null element, should be error: ");
		String nullTest = null;
		System.out.println(list.add(nullTest).getError());
		System.out.print("Testing adding a null element, should be error: ");
		System.out.println(list.add(0, nullTest).getError());
		System.out.print("Testing adding an element, should be error: ");
		System.out.println(list.add(-1, "tenth").getError());
		System.out.print("Testing adding an element, should return first String: ");
	  	System.out.println(list.add("first String").getReturnValue());
	  	System.out.print("Testing if the list is empty, should return false: " );
	  	System.out.println(list.isEmpty());
		System.out.print("Testing the size, should be 1: ");
		System.out.println(list.size());
		System.out.print("Testing get, should return first String: ");
	  	System.out.println(list.get(0).getReturnValue());
	  	System.out.print("Testing get, should be error: ");
	  	System.out.println(list.get(1).getError());
	  	System.out.print("Testing remove, should return first string: " );
	  	System.out.println(list.remove(0).getReturnValue());
	  	System.out.print("Testing the size, should be 0: ");
		System.out.println(list.size());
	  	System.out.print("Testing get, should be error: ");
	  	System.out.println(list.get(0).getError());
	  	
	  	System.out.println("");

	  	list.add("first String");
	  	list.add("second String");
	  	list.add("third String");
	  	list.add("fourth String");
	  	list.add("fifth String");
	  	list.add("sixth String");
	  	list.add("seventh String");
	  	System.out.print("Testing the size, should be 7: ");
		System.out.println(list.size());
	  	System.out.print("Testing remove, should return fifth string: " );
	  	System.out.println(list.remove(4).getReturnValue());
	  	System.out.print("Testing the size, should be 6: ");
		System.out.println(list.size());
		System.out.print("Testing get, should return sixth String: ");
	  	System.out.println(list.get(4).getReturnValue());
	  	System.out.print("Testing remove, should return first string: " );
	  	System.out.println(list.remove(0).getReturnValue());
	  	System.out.print("Testing the size, should be 5: ");
		System.out.println(list.size());
		System.out.print("Testing get, should return seventh String: ");
	  	System.out.println(list.get(4).getReturnValue());
		System.out.print("Testing adding an element, should be no error: ");
		System.out.println(list.add(0, "tenth").getError());
		System.out.print("Testing the size, should be 6: ");
		System.out.println(list.size());
		System.out.print("Testing get, should return sixth String: ");
	  	System.out.println(list.get(4).getReturnValue());

	  	

	  
	

	}
    

}