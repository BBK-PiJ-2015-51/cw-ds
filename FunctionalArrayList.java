public class FunctionalArrayList extends ArrayList implements FunctionalList {

	FunctionalList newFunctionalList;

	public ReturnObject head() {
		if (get(0) == null) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			} else {
			return new ReturnObjectImpl(get(0));
		}
	}

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