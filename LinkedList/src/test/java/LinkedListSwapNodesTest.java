import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListSwapNodesTest {

	LinkedListSwapNodes LLSN1 = new LinkedListSwapNodes();
	@Test
	public void test() {
		LLSN1.pushFront(5);
		LLSN1.pushFront(10);
		LLSN1.pushFront(12);
		LLSN1.pushFront(19);
		LLSN1.pushFront(88);
		
		int value1=0;
		
		LLSN1.pushFront(99);
		LLSN1.pushBack(100);
		int valuecheck=100;
		assertEquals(valuecheck,LLSN1.swap());
	}

}
