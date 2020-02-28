
public class SimpleReceiptFactory {

	public Receipt createReceipt(String type) {
		Receipt receipt = null;

		if (type.equals("credit")) {
			receipt = new Credit();
		} else if (type.equals("debit")) {
			receipt = new Debit();
		} else if (type.equals("cash")) {
			receipt = new Cash();
		}
		return receipt;
	}
}

