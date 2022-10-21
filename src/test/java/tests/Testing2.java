package tests;

import org.testng.annotations.Test;

public class Testing2 {
	
  @Test (groups = "smoke")
  public void Test4() {
	  System.out.println("test4");
  }
  
  @Test (groups = "important") 
  public void Test5() {
	  System.out.println("test5");
  }
}
