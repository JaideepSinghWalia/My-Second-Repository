package Demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
  @Test
  public void f() {
	SoftAssert sa= new SoftAssert();
	
	sa.assertTrue(10>9);
	
	sa.assertEquals(10, 11);
	
	sa.assertFalse(10>9);
	  
	sa.assertAll();
  }
}
