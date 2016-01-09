
public class ImprovedStackImpl implements ImprovedStack {

	
	public StackImpl newStackImpl;

	public ImprovedStackImpl(List list) {
		newStackImpl = new StackImpl(list);
		
	}
	
	public ImprovedStack reverse() {
		
		int addIndex = 1;
		int removeIndex = 2;
		while(addIndex <= newStackImpl.size()) {
			newStackImpl.internalList.add(newStackImpl.internalList.get(newStackImpl.internalList.size()-addIndex).getReturnValue());
			newStackImpl.internalList.remove(newStackImpl.internalList.size()-removeIndex);
			addIndex++;
			removeIndex++;
		}

		ImprovedStack reversedStack = new ImprovedStackImpl(newStackImpl.internalList);
		return reversedStack;
	}

	public void remove(Object object) {
		int i = 0;
		while (i < newStackImpl.size()) {
			if (newStackImpl.internalList.get(i).getReturnValue().equals(object)) {
				newStackImpl.internalList.remove(i);
			} else {
				i++;
			}
		}
	}

	public boolean isEmpty() {
		return newStackImpl.isEmpty();
	}

	public int size() {
		return newStackImpl.size();
	}

	public void push(Object item) {
		newStackImpl.push(item);
	}

	public ReturnObject top() {
		return newStackImpl.top();
	}

	public ReturnObject pop() {
		return newStackImpl.pop();
	}



}