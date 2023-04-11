package demo.q9;

public class TestClass extends B implements A{
    public static void main(String[] arge)
    {
                    TestClass tc =  new TestClass();
                    tc.m();
    }              
}
interface A {
    public default void m()
    {
                    System.out.println("class A");                     
    }
}
class B
{
    public void m()
    {
                    System.out.println("class b");                     
    }
}






//Output is  : class b
