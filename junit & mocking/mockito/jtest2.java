package package1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class jtest2 {

	testing1 t;
	testing2 t1;
	@Before
	public void setup()
	{	
		 t1=mock(testing2.class);
		 t= new testing1(t1);
	}
	@Test
	public void test() {
		t.set(2000, 1000);
		when(t1.checkid("rohit", "345")).thenReturn(true);//stubs
		when(t1.checkid(null, null)).thenReturn(true);//stub
		assertEquals(true,t1.checkid("rohit", "345"));
		assertEquals(1000,t.get());
	}
	
}
