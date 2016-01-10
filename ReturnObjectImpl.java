/**
 * An implementation of {@ReturnObject} that returns a wrapper containing the result of an operation
 * on a data structure or an error value.
 *
 * @author SJENKI05
 */
public class ReturnObjectImpl implements ReturnObject {
	/**
	 * The object which is the result of the operation
	 */
	private Object obj;
	/**
	 * The associated error message for an unsuccesful operation
	 */
	private ErrorMessage em;

	/**
	 * Constructer for succesful operation
	 * @param object the result of a successful operation
	 * @return the wrapper containing successful operation 
	 */
	public ReturnObjectImpl(Object o) {
		this.obj = o;
		this.em = ErrorMessage.NO_ERROR;
	}

	/**
	 * Constructer for unsuccesful operation
	 * @param ErrorMessage the associated error message of unsuccesful operation
	 * @return the wrapper containing error message
	 */
	public ReturnObjectImpl(ErrorMessage em) {
		this.em = em;
		this.obj = null;
	}

	/**
	 * Checks if wrapper contains error message
	 * @return boolean true if wrapper contains an error
	 */
	public boolean hasError() {
		return em != ErrorMessage.NO_ERROR;
	}

	/**
	 * Returns the type of error
	 * @return ErrorMessage associated with operation
	 */
	public ErrorMessage getError() {
		return em;
	}

	/**
	 * Returns the object
	 * @return Object associated with operation
	 */
	public Object getReturnValue() {
		return obj;
	}
}


