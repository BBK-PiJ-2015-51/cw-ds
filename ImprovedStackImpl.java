
public class ImprovedStackImpl implements ImprovedStack {

	
	StackImpl newStackImpl;

	public ImprovedStackImpl(List list) {
		newStackImpl = new StackImpl(list);
		
	}
	
	public ImprovedStack reverse() {
		ImprovedStack newImprovedStack = new ImprovedStackImpl(newStackImpl.internalList);
		return newImprovedStack;
	}

	public void remove(Object object) {

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