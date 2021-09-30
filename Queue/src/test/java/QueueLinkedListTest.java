import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkedListTest {

	QueueLinkedList QLL1 = new QueueLinkedList();
	@Test
	public void test() {
		QLL1.enqueue(5);
		QLL1.enqueue(10);
		QLL1.enqueue(15);
		QLL1.enqueue(20);
		QLL1.dequeue();
		QLL1.enqueue(5);
		
		
		
	}

}
