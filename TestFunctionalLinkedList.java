public class TestFunctionalLinkedList {
	
	public static void main (String args[]) {

		String a = new String("one");
		String b = new String("two");
		String c = new String("three");
		String d = new String ("four");
		String e = new String("five");
		String f = new String("six");

		List originalList = new ArrayList();

		originalList.add(a);
		originalList.add(b);
		originalList.add(c);
		originalList.add(d);
		originalList.add(e);
		originalList.add(f);

		SampleableList newSampleableList = new SampleableListImpl(originalList);

		System.out.println(newSampleableList.sample().get(2).getReturnValue());

	
		
	}
}