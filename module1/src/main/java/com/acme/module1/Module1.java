package com.acme.module1;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }
  
  public void display(String email) {
	    System.out.println("This method display email"+email);
	  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

}
