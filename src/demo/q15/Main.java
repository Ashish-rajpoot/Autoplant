package demo.q15;

public class Main{ 
    public static void main(String []args){ 
       try 
       { 
           throw new Calculation();   
       } 
       catch(Calculation c){ 
           c.add(10,20); 
       } 
   } 
}

//Output : Calculation class is instantiated
//The sum is 30