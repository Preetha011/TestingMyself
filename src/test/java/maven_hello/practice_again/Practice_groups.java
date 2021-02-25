package maven_hello.practice_again;

import org.testng.annotations.Test;

public class Practice_groups {
  @Test(priority=3)
  public void A() {
	  System.out.println("hello A");
  }
  
  @Test(priority=2)
  public void B() {
	  System.out.println("hello B");
  }
  
  @Test(priority=1)
  public void C() {
	  System.out.println("hello C");
  }
  
  @Test(priority=5)
  public void D() {
	  System.out.println("hello D");
  }
  
  @Test(priority=4)
  public void E() {
	  System.out.println("hello E");
  }
}
