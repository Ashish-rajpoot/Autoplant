package demo.q12;

class Bike{ 
	void run(){System.out.println("running");}
	}
	class Honda extends Bike{ 
	  void run(){System.out.println("running safely with 100kmph");}   
	  public static void main(String args[]){ 
	  Honda honda= new Honda(); 
	                  honda.run(); 
	                  } 
	               }

	
//	Output : running safely with 100kmph