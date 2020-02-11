import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommandTest {

	@Test
	void test() {
		Order order = new Order();
		Customer customer = new Customer();
		Waitress waitress = new Waitress();
		Chef chef = new Chef();
		
		Ordered ordered = new Ordered(customer);
		OrderedCalamari orderedCalamari = new OrderedCalamari(customer);
		OrderedCapreseSkewers orderedCapreseSkewers = new OrderedCapreseSkewers(customer);
		
		TookOrder tookOrder = new TookOrder(waitress);
		MarkedCalamari markedCalamari = new MarkedCalamari(waitress);
		MarkedCapreseSkewers markedCapreseSkewers = new MarkedCapreseSkewers(waitress);		
		
		Prepared prepared = new Prepared(chef);
		PrepareCalamari prepareCalamari = new PrepareCalamari(chef);
		PrepareCapreseSkewers prepareCapreseSkewers = new PrepareCapreseSkewers(chef);
 
		order.setCommand(ordered);
		order.orderWasPlaced();
		order.setCommand(orderedCalamari);
		order.orderWasPlaced();
		order.setCommand(orderedCapreseSkewers);
		order.orderWasPlaced();
		
		order.setCommand(tookOrder);
		order.orderWasReceived();
		order.setCommand(markedCalamari);
		order.orderWasReceived();
		order.setCommand(markedCapreseSkewers);
		order.orderWasReceived();
		
		order.setCommand(prepared);
		order.orderWasPrepared();
		order.setCommand(prepareCalamari);
		order.orderWasPrepared();
		order.setCommand(prepareCapreseSkewers);
		order.orderWasPrepared();

	}

}
