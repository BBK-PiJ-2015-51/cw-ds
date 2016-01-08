
public class SampleableListImpl implements SampleableList {

	List newList;
	

	public SampleableListImpl(List l) {
		this.newList = l;
	}

	
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