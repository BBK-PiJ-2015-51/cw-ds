public class LinkedList implements List {

	private int numberOfElements = 0;
	private LinkedListNode startOfList = null;
	                                                                    
	public boolean isEmpty() {
		if (startOfList == null) {
			return true;
		} else {
			return false;
		}
	} 

	public LinkedListNode getStartOfList() {
		return startOfList;
	}

	public void setStartOfList(LinkedListNode n) {
		this.startOfList = n;
	} 

	public int size () {
		return numberOfElements;
	}

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

	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberOfElements) {
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