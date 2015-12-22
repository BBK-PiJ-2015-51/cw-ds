public class ArrayList implements List {

	private object[] intArray;
	private final static int DEFAULT_SIZE = 20;
	private int numberOfElements;

	public ArrayList() {
		intArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}

	public boolean isEmpty {
		return numberOfElements == 0;
	}

	public int size {
		return numberOfElements
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= numberofElements) {
			return new ReturnObjectImpl(ErrorMessage.Index_Out_Of_Bounds)
		} else {
			return new ReturnObjectImpl(intArray[index])
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberofElements) {
			return new ReturnObjectImpl(ErrorMessage.Index_Out_Of_Bounds)
		} else {
	  		Object[] tempArray = intArray;
	  		for(int i = 0; i < intArray.index; i++) {
	  			if (i < index) {
	  				temp[i] = intArray[i];
	  			} else {
	  				temp[i] = intArray[i+1];
	  			}
	  		}
	  		this.intArray = tempArray;
	  		return ReturnObjectImpl(intArray[index];
	  	}

	}

	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (isAlmostFull()) {
			reserveMoreMemory();
	  		}
	  		Object[] tempArray = intArray;
	  		for(int i = 0; i < intArray.length; i++) {
	  			if (i < index) {
	  				temp[i] = intArray[i];
	  			} else {
		  			temp[i+1] = intArray[i];
	  			}
	  		this.intArray = tempArray;
	  		return ReturnObjectImpl(intArray[index];
	  	}
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (isAlmostFull()) {
			reserveMoreMemory();
	  		}
	  		intArray[numberOfElements] = item;
	  		numberOfElements++;
	  		return new ReturnObjectImpl(intArray[item]);
		}
	}

	private boolean isAlmostFull() {
	  if (intArray.length - size < 1) {
		return true;
	  } else {
		return false;
	  }
    }

	private void reserveMoreMemory() {
	  Object[] biggerArray = new Object[numberOfElements*2];
	  for (int i = 0; i < numberOfElements; i++) {
		biggerArray[i] = this.intArray[i];
	  }
	  this.intArray = biggerArray;
    }



//re write system.arraycopier in new method (from notes...)

}