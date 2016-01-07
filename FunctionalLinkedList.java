public class FunctionalLinkedList extends LinkedList implements FunctionalList  {

	FunctionalList newFunctionalList;

	public ReturnObject head() {
		if (getStartOfList() == null) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(getStartOfList().getObject());
		}
	}

	public FunctionalList rest() {
		
		newFunctionalList = new FunctionalLinkedList();

		LinkedListNode tempNode = getStartOfList().getNextNode();

		while (tempNode.getNextNode() != null) {
			Object tempObject = new Object();
			tempObject = tempNode.getObject();
			newFunctionalList.add(tempObject);
			tempNode = tempNode.getNextNode();
		}
		return newFunctionalList;
	}

}