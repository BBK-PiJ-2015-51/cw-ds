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


	public int size () {
		return numberOfElements;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			LinkedListNode tempNode = startOfList;
			for(int i = 0; i < index; i++) {
				tempNode = tempNode.nextObject;
			}
			return new ReturnObjectImpl(tempNode.object);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			} else {
				LinkedListNode tempNode = startOfList;
				for(int i = 0; i < index; i++) {
					tempNode = tempNode.nextObject;
			}
			LinkedListNode objectRemoved = tempNode;
			tempNode.nextObject = tempNode.nextObject.nextObject;
			numberOfElements--;
			return new ReturnObjectImpl(objectRemoved.object);
		}
	}





	public ReturnObject add(int index, Object item) {
		return new ReturnObjectImpl(item);
	}

	public ReturnObject add(Object item) {

		LinkedListNode newNode = new LinkedListNode(item);

		if (startOfList == null) {
			startOfList = newNode;
			numberOfElements++;
			return new ReturnObjectImpl(item);
		} else {
			LinkedListNode temp = startOfList;
			while (temp.nextObject != null) {
				temp = temp.nextObject;
			}

			temp.nextObject = newNode;
			numberOfElements++;
			return new ReturnObjectImpl(item);
		}
	}

}