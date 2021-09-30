import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayTest {

	StackArray SA1 = new StackArray();
	@Test
	public void test() {
		SA1.push(10);
		SA1.push(20);
		SA1.push(30);
		SA1.pop();
		SA1.push(40);
		SA1.push(50);
		SA1.pop();
		SA1.push(60);
		SA1.push(70);
		SA1.display();
		int sizecheck=5;
		assertEquals(sizecheck,SA1.size);
		
	}

}
