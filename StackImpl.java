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

		if (internalList.get(size()-1) == null) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return internalList.get(size()-1);
		}
		
	}

	public ReturnObject pop() {

		ReturnObject temp = internalList.get(size()-1);
		internalList.remove(size()-1);
		return temp;
	}

}