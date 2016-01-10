/**
 * Implementation of {@SampleableListImpl}
 * 
 * @author SJENKI05
 */
public class SampleableListImpl implements SampleableList {

	/**
	 * holds the sampleable list
	 */
	private List newList;
	
	/**
	 * constructor that creates a new list of no existing list is supplied
	 */
	public SampleableListImpl() {
		newList = new ArrayList();
	}

	/**
	 * constructor that creates a new list if existing list is supplied
	 *
	 * @param existing list to sample
	 */
	public SampleableListImpl(List l) {
		this.newList = l;
	}
	
	/**
	 * changes the list to return the 1st, 3rd, 5th elements in the list
	 */
	public SampleableList sample() {
		for (int i = 1; i < size(); i++) {
			remove(i);
		}
		return new SampleableListImpl(newList);
	}

	public boolean isEmpty() {
		return newList.isEmpty();
	}

	public int size() {
		return newList.size();
	}

	public ReturnObject get(int index) {
		return newList.get(index);
	}

	public ReturnObject remove(int index) {
		return newList.remove(index);
	}

	public ReturnObject add(int index, Object item) {
		return newList.add(index,item);
	}

	public ReturnObject add(Object item){
		return newList.add(item);
	}

}