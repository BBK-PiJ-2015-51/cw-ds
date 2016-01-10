/**
*Implementation of Improved Stack
*
* SJENKI05
*/
public class ImprovedStackImpl implements ImprovedStack {

	/**
	*Holds the new Stack
	*/
	private StackImpl newStackImpl;

	/**
	* Constructor that creates the new list
	* @param the list to be improved
	*/
	public ImprovedStackImpl(List list) {
		newStackImpl = new StackImpl(list);
	}

	/**
	* reverses the list to be improved
	* @return the improved list
	*/
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

	/**
	* checks if object is in list and removes it
	* @param the object to be removed
	*/
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