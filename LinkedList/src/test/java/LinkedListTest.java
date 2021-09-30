import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	
	LinkedList LL1 = new LinkedList();
		
	@Test
	public void test() {
		LL1.pushFront(10);
		LL1.pushFront(15);
		LL1.pushBack(35);
		LL1.pushFront(65);
		LL1.pushFront(55);
		LL1.pushFront(45);
		LL1.pop(2);
		int size = 6;
		assertEquals(size,LL1.pushFront(95));
	}

}