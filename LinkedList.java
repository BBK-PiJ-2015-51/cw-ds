
/**
* An implementation of {@List} that uses a Linked list as data structure 
* to hold Objects using {@LinkedListNode}
* @author SJENKI05
*/
public class LinkedList implements List {

	/**
	 * Holds the number of objects in the list
	 */
	private int numberOfElements = 0;

	/**
	 * Holds the {@LinkedListNode} at the start of the list
	 */
	private LinkedListNode startOfList = null;
	                       
	/**
	 * Checks if the array list is empty 
	 * @return boolean true if empty
	 */                                             
	public boolean isEmpty() {
		if (startOfList == null) {
			return true;
		} else {
			return false;
		}
	} 

	/**
	 * Checks if the array list is empty 
	 * @return boolean true if empty
	 */
	public LinkedListNode getStartOfList() {
		return startOfList;
	}

	/**
	 * Sets the start of the list
	 * @param the linked list node to assign to start of list
	 */
	public void setStartOfList(LinkedListNode n) {
		this.startOfList = n;
	} 

	/**
	 * Returns the size of the list
	 * @return int size of list
	 */
	public int size () {
		return numberOfElements;
	}

	/**
	 * Returns the object at the requested index value
	 * @param integer of index value
	 * @return object at index value
	 */
	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			LinkedListNode tempNode = startOfList;
			for(int i = 0; i < index; i++) {
				tempNode = tempNode.getNextNode();
			}
			return new ReturnObjectImpl(tempNode.getObject());
		}
	}

	/**
	 * Removes the object at the requested index value and reorders
	 * subsequent list
	 * @param integer of index value
	 * @return object removed
	 */
	public ReturnObject remove(int index) {
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			} else if (index == 0) {
				LinkedListNode objectRemoved = startOfList;
				if (startOfList.getNextNode() == null) {
					startOfList = null;
					numberOfElements--;
					return new ReturnObjectImpl(objectRemoved.getObject());
				} else {
					numberOfElements--;
					startOfList = startOfList.getNextNode();
					return new ReturnObjectImpl(objectRemoved.getObject());
				}
			} else {
				LinkedListNode tempNode = startOfList;
				for(int i = 0; i < index-1; i++) {
					tempNode = tempNode.getNextNode();
				}
				LinkedListNode objectRemoved = tempNode.getNextNode();
				tempNode.setNextNode(tempNode.getNextNode().getNextNode());
				numberOfElements--;
				return new ReturnObjectImpl(objectRemoved.getObject());
			}
	}

	/**
	 * Adds an object at the requested index value and reorders
	 * subsequent list
	 * @param integer of index value and object to be added
	 * @return object added
	 */
	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			LinkedListNode newNode = new LinkedListNode(item);
			if (index < 0 || index >= numberOfElements) {
				return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				} else {
					if (startOfList == null) {
						startOfList = newNode;
						numberOfElements++;
						return new ReturnObjectImpl(item);
					} else {
						LinkedListNode tempNode = startOfList;
						for (int i = 0; i < index-1; i++) {
							tempNode = tempNode.getNextNode();
					}
					newNode.setNextNode(tempNode.getNextNode());
					tempNode.setNextNode(newNode);
					}
					numberOfElements++;
					return new ReturnObjectImpl(newNode.getObject());
			}
		}
	}

	/**
	 * Adds an object at the end of the list
	 * @param object to be added
	 * @return object added
	 */
	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			LinkedListNode newNode = new LinkedListNode(item);
			if (startOfList == null) {
				startOfList = newNode;
				numberOfElements++;
				return new ReturnObjectImpl(item);
			} else {
				LinkedListNode temp = startOfList;
				while (temp.getNextNode() != null) {
					temp = temp.getNextNode();
				}
				temp.setNextNode(newNode);
				numberOfElements++;
				return new ReturnObjectImpl(item);
			}
		}
	}
}