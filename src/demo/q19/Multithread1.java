package demo.q19;

public class Multithread1 extends Thread 
{ 
   public void run() 
    { 
      try { 
          System.out.println("thread is executing now........"); 
      } catch(Exception e) { 
      } 
    } 
    public static void main (String[] args) { 
        Multithread1 m1= new Multithread1(); 
        m1.start(); 
        m1.start(); 
    } 
} 

//Output : 
//Exception in thread "main" thread is executing now........
//java.lang.IllegalThreadStateException
//at java.base/java.lang.Thread.start(Thread.java:794)
//at demo/demo.q19.Multithread1.main(Multithread1.java:15)