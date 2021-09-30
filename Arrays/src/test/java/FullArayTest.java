import static org.junit.Assert.*;

import org.junit.*;
import static org.junit.Assert.*;
public class FullArayTest {

	FullAray a1 = new FullAray();
	int [] array = new int[4];
	
	@Before
	public void BeforeTest()
	{
	a1.insert(10, 0);
	a1.insert(14, 1);
	a1.insert(12, 2);
	a1.insert(19, 3);
	a1.insert(22, 4);
	a1.insert(40, 5);
	a1.delete(4);
	}
	
	@Test
	public void test() {		
		
		assertEquals(true,a1.binarySearch(12, 1, 3));	
	}
	
	@Test
	public void test1() {
	
		assertEquals(true,a1.linearSearch(10));
		
	}

}
