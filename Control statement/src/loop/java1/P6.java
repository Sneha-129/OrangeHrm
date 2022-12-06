
//we can call static method by directly name or className.methodNAme();
 
package loop.java1;

public class P6 {
	

	public static void main(String[] args) {
		
		                                           //we can call static method by directly name or className.methodNAme()
		System.out.println("main start");
		P6.m1();                                   //m1() only call method name and classname.methodname
		
		System.out.println("main end");
	}
	
	public static void m1() {
		
		System.out.println("Static regular method");
	}

}


