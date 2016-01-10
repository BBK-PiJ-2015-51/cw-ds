/**
 * An implementation of a functional list using {@arraylist}
 *
 *  @author SJENKI05
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

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
			return new ReturnObjectImpl(get(0).getReturnValue());
		}
	}

	/**
 	* returns a new functional list excluding the head
 	* @return a new functional list excluding the head
 	*/
	public FunctionalList rest() {
		newFunctionalList = new FunctionalArrayList();
		for(int i = 1; i < size(); i++) {
			Object tempObject = new Object();
			tempObject = get(i).getReturnValue();
			newFunctionalList.add(tempObject);
		}
		return newFunctionalList;
	}
}