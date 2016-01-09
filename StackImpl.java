public class StackImpl extends AbstractStack {
	
	public StackImpl(List list) {
		super(list);
	}

	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	public int size() {
		return internalList.size();
	}

	public void push(Object item) {
		internalList.add(item);

	}

	public ReturnObject top() {
		return internalList.get(size()-1);
	}

	public ReturnObject pop() {
		return internalList.remove(size()-1);
	}

}