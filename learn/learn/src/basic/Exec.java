package basic;

import org.junit.Test;

public class Exec extends A {
	@Test
   public void signUp() {
	   B s=new B();  
   s.setFname("sayan");
   s.setLname("Shamim");
   s.setEmail("asma.talukder@yahoo.com");
   
   s.setPassw("a123");
   
   C k=new C(dr);
   
   k.fbsignUp(s.getFname(), s.getLname(), s.getEmail(), s.getPassw());
   }
	
	
	
	
	
	
	
	
	
	
	
}
