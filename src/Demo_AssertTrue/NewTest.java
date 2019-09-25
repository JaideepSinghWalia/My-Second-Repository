package Demo_AssertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TestMethod1() {
	  Assert.assertTrue(20>18);
  }
  
  @Test
  public void TestMethod2() {
	  Assert.assertFalse("Hello".startsWith("J"));
  }
  
  @Test
  public void TestMethod3() {
	  Assert.assertEquals(10,10);
  }
  
  @Test
  public void TestMethod4() {
	  Assert.assertNotEquals(10,20);
  }
  
  @Test
  public void TestMethod5() {
	  Object obj1 = new Object(); 
	  Assert.assertNull(obj1);
	  Assert.assertEquals(10, 10);
  }
}