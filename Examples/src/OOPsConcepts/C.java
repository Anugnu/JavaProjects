package OOPsConcepts;

public class C extends B { // inheritance -> Acquiring the properties of Parent (Super) Class

	public void method1() { // Runtime Polymorphism(method overriding)
	
		System.out.println("Overridden version of method1");
	      
	}
	public void method2(int a) {  // Polymorphism -> Single interface with multiple methods
	    
		System.out.println("Int argument method");
		
	}
	
	public void method2(String s) { // Compiletime Polymorphism(method overloading)
	
		System.out.println("Overloaded method of string argument");
		
	}
	
}
