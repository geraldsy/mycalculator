import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class MyTester{
	MyCalculator m = new MyCalculator();
	
	@Test
	public void nfactorialtest(){
		assertEquals("0!=1", 1, m.nfactorial(0)); 
		assertEquals("1!=1", 1, m.nfactorial(1)); 
		assertEquals("2!=6", 2, m.nfactorial(2)); 
		assertEquals("3!=6", 6, m.nfactorial(3)); 
	}
	
	@Test
	public void bsttest(){
		int[] myIntArray = {17};
		assertEquals("17=array[0]", 0, m.binarySearch(myIntArray,17));//only one value array
		int[] myIntArray2 = {17};
		assertEquals("0=-1", -1, m.binarySearch(myIntArray2,0)); //only one value in array but value not found
		int[] myIntArray3 = {4,11,15,17};
		assertEquals("4=array[0]", 0, m.binarySearch(myIntArray3,4)); //front
		assertEquals("17=array[3]", 3, m.binarySearch(myIntArray3,17)); //last
		assertEquals("15=array[2]", 2, m.binarySearch(myIntArray3,15)); //middle
		assertEquals("16=-1", -1, m.binarySearch(myIntArray3,16));//notfound
	}
}
