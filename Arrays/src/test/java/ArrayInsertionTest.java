import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayInsertionTest {

	ArrayInsertion a1 = new ArrayInsertion();
	int [] array = new int[6];
	
	
	@Test

	public void test() {
	a1.insert(array, 5, 0);	
	a1.insert(array, 6, 1);
	a1.insert(array, 7, 2);
	a1.insert(array, 8, 3);
	a1.insert(array, 9, 4);
	int[] array2= new int [6];
	int num=5;
	for(int i=0; i<5; i++)
	{
		array2[i]=num;
		num++;
	}
	for(int i=0; i<5; i++)
	{	
	assertEquals(array2[i],array[i]);
	}
	}

}
