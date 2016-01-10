public class FunctionalArrayList extends ArrayList implements FunctionalList {

	private FunctionalList newFunctionalList;

	public ReturnObject head() {
		if (size() == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			} else {
			return new ReturnObjectImpl(get(0).getReturnValue());
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