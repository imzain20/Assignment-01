import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueTest {
	Dequeue d1 = new Dequeue(5);
	@Test
	public void test() {
		d1.addLeft(5);
		d1.addLeft(10);
		d1.addRight(15);
		d1.addRight(20);
		
		
	}

}
