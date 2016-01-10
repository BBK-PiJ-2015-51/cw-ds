/**
 * An implementation of {@List} that uses an Array as data structure to hold Objects
 *
 * @author SJENKI05
 */
public class ArrayList implements List {

	/**
	 * The object array which holds the objects
	 */
	private Object[] intArray;

	/**
	 * The default size of the array when created
	 */
	private final static int DEFAULT_SIZE = 20;

	/**
	 * Holds the number of objects in the list
	 */
	private int numberOfElements;

	/**
	 * Constructer which creates a new array list and initialises 
	 * numberOfElements to 0 
	 */
	public ArrayList() {
		intArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}

	/**
	 * Checks if the array list is empty 
	 * @return boolean true if empty
	 */
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	/**
	 * Returns the size of the list
	 * @return int size of list
	 */
	public int size() {
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
			return new ReturnObjectImpl(intArray[index]);
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
		} else {
	  		Object[] tempArray = new Object[numberOfElements];
	  		Object removeObject = intArray[index];
	  		int lastIndex = size()-1;
	  		for(int i = 0; i < lastIndex; i++) {
	  			if (i < index) {
	  				tempArray[i] = intArray[i];
	  			} else {
	  				tempArray[i] = intArray[i+1];
	  			}
	  		}
	  		this.intArray = tempArray;
	  		numberOfElements--;
	  		return new ReturnObjectImpl(removeObject);
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
		} else if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
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

	/**
	 * Adds an object at the end of the list
	 * @param object to be added
	 * @return object added
	 */
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

	/**
	 * Checks if the array list is almost full
	 * @return true if almost full
	 */
	private boolean isAlmostFull() {
	  if (intArray.length - numberOfElements < 1) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
	 * Creates a new bigger array and copies over values
	 */
	private void reserveMoreMemory() {
	  Object[] biggerArray = new Object[numberOfElements*2];
	  for (int i = 0; i < numberOfElements; i++) {
		biggerArray[i] = this.intArray[i];
	  }
	  this.intArray = biggerArray;
    }

}