import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayDeletionTest {
	ArrayDeletion a1 = new ArrayDeletion();
	int [] array = new int[6];
	
	@Test
	
	public void test() {
		int num=5;
		int[] array2= new int [6];
		for(int i=0; i<5; i++)
		{
			array2[i]=num;
			num++;
		}
		num=6;
		for(int i=0; i<4; i++)
		{
			array[i]=num;
			num++;
		}
		a1.delete(array2, 0);
		for(int i=0; i<5; i++)
		{	
		assertEquals(array[i],array2[i]);
		}
	}

}
