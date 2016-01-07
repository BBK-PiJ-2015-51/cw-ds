public class ReturnObjectImpl implements ReturnObject {

	public Object obj;
	public ErrorMessage em;

	public ReturnObjectImpl(Object o) {
		this.obj = o;
		this.em = ErrorMessage.NO_ERROR;
	}

	public ReturnObjectImpl(ErrorMessage em) {
		this.em = em;
		this.obj = null;
	}

	public boolean hasError() {
		return em != ErrorMessage.NO_ERROR;
	}

	public ErrorMessage getError() {
		return em;
	}

	public Object getReturnValue() {
		return obj;
	}

}