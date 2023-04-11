package demo.q6;

class A2 {
	{
            System.out.println("block");
        }

	public static void main(String args[]) {
		System.out.println("Hello main");
		A2 a2 = new A2();
	}

	static {
		System.out.println("static block is invoked");
	}
}

//Output
//static block is invoked
//Hello main
//block
