public class TestReturnObjectImpl {

	public static void main(String[] args) {

		ReturnObject result = new ReturnObjectImpl("1st");

		if (!result.hasError()) {
		System.out.println("does not has error");
		}

		if (result.getError().equals(ErrorMessage.NO_ERROR)) {
			System.out.println("maybe");
		}
}
}