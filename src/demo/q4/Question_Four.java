package demo.q4;

public class Question_Four {

	 
	   int i;   
	   public Question_Four(int k) 
	   { 
	       i=k; 
	   } 
	   public Question_Four(int k, int m) 
	   { 
	                       System.out.println("Hi I am assigning the value max(k, m) to i"); 
	                       if(k>m) 
	                       { 
	                           i=k;   
	                       } 
	                       else 
	                       { 
	                           i=m; 
	                       } 
	                   } 
	               
	             
	                  public static void main (String args[]) 
	                   { 
	                       Question_Four test1 = new Question_Four(10); 
	                       Question_Four test2 = new Question_Four(12, 15); 
	                       System.out.println(test1.i); 
	                       System.out.println(test2.i); 
	                   } 
	               
	               }      
	               

//Output :
//	Hi I am assigning the value max(k, m) to i
//	10
//	15