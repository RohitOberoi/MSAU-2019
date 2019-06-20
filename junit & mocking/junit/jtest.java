package package1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class jtest {

	testing t;
	@Before
	public void setup()
	{
		 t= new testing();
	}
	@Test
	public void test() {
		t.set(5000,3000);
		assertEquals(2000,t.get());
	}
	
	@Test
	public void test1() {
		t.set(3000,5000);
		assertEquals(-1,t.get());
	}
	

}
