public class TestSampleableList {
	
	public static void main(String[] args) {
	  TestSampleableList testList = new TestSampleableList();
	  testList.launch();
    }

    public void launch() {
	  SampleableList firstList = new SampleableListImpl();
	  testSampleableList(firstList);
	  
    }

    private void testSampleableList(SampleableList list) {
	  
		System.out.println("Testing the list..."); 

	  	System.out.println("");
	  	list.add("one");
	  	list.add("two");
	  	list.add("three");
	  	list.add("four");
	  	list.add("five");
	  	list.add("six");
	  	list.add("seven");
	  	list.add("eight");
	  	list.add("nine");
	  	

		SampleableList newList = list.sample();

		System.out.println(newList.get(0).getReturnValue());
		System.out.println(newList.get(1).getReturnValue());
		System.out.println(newList.get(2).getReturnValue());
		System.out.println(newList.get(3).getReturnValue());
		System.out.println(newList.get(4).getReturnValue());
		System.out.println(newList.get(5).getError());

	}
    

}