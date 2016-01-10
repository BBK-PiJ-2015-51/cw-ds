public class TestFunctionalLinkedList {
	
	public static void main (String args[]) {

		String a = new String("one");
		String b = new String("two");
		String c = new String("three");
		String d = new String ("four");
		String e = new String("five");
		String f = new String("six");

		FunctionalList originalList = new FunctionalLinkedList();

		originalList.add(a);
		originalList.add(b);
		originalList.add(c);
		originalList.add(d);
		originalList.add(e);
		
		System.out.println(originalList.head().getReturnValue());
		
		System.out.println(originalList.rest().get(1).getReturnValue());


	}
}