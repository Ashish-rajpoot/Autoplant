package demo.q8;


	abstract class Test
	{ 
	   static int i = 102; 
	   static void TestMethod() 
	   { 
	      System.out.println("I am good !!"); 
	   }
	}
	public class TestClass extends Test  
	               { 
			
	                    static int i=103;
	                   public static void main (String args[]) 
	                   { 
	                       TestClass.TestMethod(); 
	                       System.out.println("i = "+ i); 
	                   } 
	               } 


//output	
//	I am good !!
//	i = 103
