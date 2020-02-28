
abstract public class Receipt {
	String name;

		public String getName() {
			return name;
		}

		public void prepare() {
			System.out.println("Preparing for " + name);
		}

		public void process() {
			System.out.println("Processing " + name);
		}

		public void print() {
			System.out.println("Printing Receipt For " + name + " Receipt");
		}


/*		public String toString() {
			// code to display pizza name and ingredients
			StringBuffer display = new StringBuffer();
			display.append("---- " + name + " ----\n");
			display.append(dough + "\n");
			display.append(sauce + "\n");
			for (String topping : toppings) {
				display.append(topping + "\n");
			}
			return display.toString();
		}
	}
*/
}
