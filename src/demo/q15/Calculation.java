package demo.q15;

class Calculation extends Exception 
{ 
    public Calculation()   
    { 
        System.out.println("Calculation class is instantiated"); 
    } 
    public void add(int a, int b) 
    { 
        System.out.println("The sum is "+(a+b));  
    } 
}   
