public class ArrayList implements List {

	private Object[] intArray;
	private final static int DEFAULT_SIZE = 20;
	private int numberOfElements;


	public ArrayList() {
		intArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}

	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	public int size() {
		return numberOfElements;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(intArray[index]);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
	  		Object[] tempArray = new Object[numberOfElements];
	  		for(int i = 0; i < numberOfElements-1; i++) {
	  			if (i < index) {
	  				tempArray[i] = intArray[i];
	  			} else {
	  				tempArray[i] = intArray[i+1];
	  			}
	  		}
	  		this.intArray = tempArray;
	  		numberOfElements--;
	  		return new ReturnObjectImpl(intArray[index]);
	  	}

	}

	public ReturnObject add(int index, Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (isAlmostFull()) {
			reserveMoreMemory();
	  		}
	  		Object[] tempArray = new Object[numberOfElements+1];
	  		for(int i = 0; i <= numberOfElements; i++) {
	  			if (i < index) {
	  				tempArray[i] = intArray[i];
	  			} else if (i == index) {
	  					tempArray[i] = item;
	  				} else {              
		  			tempArray[i] = intArray[i-1];
	  			}
	  		}
	  		this.intArray = tempArray;
	  		}
		numberOfElements++;
		return new ReturnObjectImpl(intArray[index]);
		
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
	  		return new ReturnObjectImpl(item);
		}
	}

	private boolean isAlmostFull() {
	  if (intArray.length - numberOfElements < 1) {
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