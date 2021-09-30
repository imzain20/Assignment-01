import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArrayTest {

	QueueArray q1 = new QueueArray(5);
	
	@Test
	public void test() {
		q1.enqueue(5);
		q1.enqueue(10);
		q1.enqueue(15);
		q1.enqueue(20);
		q1.dequeue();
		
		int sizecheck=3;
		assertEquals(sizecheck,q1.size);
		
	}

}
