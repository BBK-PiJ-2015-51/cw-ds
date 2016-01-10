public class TestFunctionalList {
	
	public static void main(String[] args) {
	  TestFunctionalList testFunctionalList = new TestFunctionalList();
	  testFunctionalList.launch();
    }

    public void launch() {
	  FunctionalList firstList = new FunctionalArrayList();
	  testFunctionalList(firstList);
	  FunctionalList secondList = new FunctionalLinkedList();
	  testFunctionalList(secondList);
    }

    private void testFunctionalList(FunctionalList list) {
	  
	  	System.out.println("");
		System.out.println("Testing Functional List");

		System.out.print("Testing head, should be error: ");
	  	System.out.println(list.head().getError());


	  	list.add("one");
	  	list.add("two");
	  	list.add("three");
	  	list.add("four");
	  	list.add("five");
	  	list.add("six");

		System.out.print("Testing head, should return one: ");
	  	System.out.println(list.head().getReturnValue());
	  	System.out.print("Testing rest, should return five: ");
	  	System.out.println(list.rest().get(3).getReturnValue());
	  
	  	FunctionalList rest = list.rest();
	  	System.out.print("Testing head of rest, should return two: ");
	  	System.out.println(rest.head().getReturnValue());
	  	System.out.print("Testing rest size, should return five: ");
	  	System.out.println(rest.size());

	  	rest.add(0,"seven");
	  	rest.add(0,"eight");
	  	rest.add(0,"nine");
	  	System.out.print("Testing original list size, should be 6: ");
	  	System.out.println(list.size());
	  	System.out.print("Testing rest size, should be 8: ");
	  	System.out.println(rest.size());
	

	}
    

}