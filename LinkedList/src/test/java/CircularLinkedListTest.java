import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTest {
	

	CircularLinkedList CL1 = new CircularLinkedList();
	
	@Test
	public void test() {
		CL1.pushFront(10);
		CL1.pushFront(15);
		CL1.pushBack(35);
		assertEquals(25,CL1.pushFront(25));
	}

}
