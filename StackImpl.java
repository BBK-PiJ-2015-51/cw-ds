/** An implemantation of Stack that uses a {@List} that is stored in {@AbstractStack}
*
* @author SJENKI05
*/
public class StackImpl extends AbstractStack {
	
	/**
	 * Constructor that sets parent class with list in parameter
	 * @param the list to hold as stack 
	 */
	public StackImpl(List list) {
		super(list);
	}

	/**
	 * returns true if the stack is empty
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	/**
	 * returns the size of the stack
	 * @return he size of the stack
	 */
	public int size() {
		return internalList.size();
	}

	/**
	 * pushes a new object on the stack
	 * @param object to be pushed on stack
	 */
	public void push(Object item) {
		internalList.add(item);
	}

	/**
	 * returns the top of the stack
	 * @return return object at top of stack
	 */
	public ReturnObject top() {
		int lastIndex = size()-1;
		if (internalList.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return internalList.get(lastIndex);
		}
	}

	/**
	 * returns and removes the top of the stack
	 * @return return object at top of stack
	 */
	public ReturnObject pop() {
		int lastIndex = size()-1;
		if (internalList.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
		ReturnObject temp = internalList.get(lastIndex);
		internalList.remove(lastIndex);
		return temp;
		}
	}

}