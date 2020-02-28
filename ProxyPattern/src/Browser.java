public class Browser {
	public static void main(String[] args) {
		WebPageProxy webPageProxy = new WebPageProxy();
		try {
			webPageProxy.renderPage("www.google.com");
		} catch (Exception e) {
			System.out.println("Exception occured " +e.getMessage());
			e.printStackTrace();
		}
		
	}

}