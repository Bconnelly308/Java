//Vodafone is an ISP
public class Vodafone implements ISP {

	@Override
	public String getResource(String site) {
		switch (site) {
		case "www.google.com":
			return "Gooooooogle";
		case "www.yahoo.com":
			return "Yahoooooooo";
		default:
			return "Sorry no resource found";
		}	
		
	}
	
}
