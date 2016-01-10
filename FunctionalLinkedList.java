/**
 * An implementation of a functional list using {@FunctionalList}
 *
 *  @author SJENKI05
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList  {

	/**
 	* holds the new Functional list to be returned
 	*/
	private FunctionalList newFunctionalList;

	/**
 	* returns the return object at head of the list
 	* @return the return object at head of the list
 	*/
	public ReturnObject head() {
		if (isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(getStartOfList().getObject());
		}
	}

	/**
 	* returns a new functional list excluding the head
 	* @return a new functional list excluding the head
 	*/
	public FunctionalList rest() {
		newFunctionalList = new FunctionalLinkedList();
		LinkedListNode tempNode = getStartOfList().getNextNode();
		while (tempNode.getNextNode() != null) {
			Object tempObject = new Object();
			tempObject = tempNode.getObject();
			newFunctionalList.add(tempObject);
			tempNode = tempNode.getNextNode();
		}
		newFunctionalList.add(tempNode.getObject());
		return newFunctionalList;
	}
}

