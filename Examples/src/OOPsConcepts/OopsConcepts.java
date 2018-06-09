package OOPsConcepts;

public class OopsConcepts {

	public static void main(String[] args) {
	
		A a = new B();
		a.method1();
		
		a = new C();
		a.method1();
		
		C c = new C();
		c.method2(5);
		c.method2("Hello");
	
	}

}
