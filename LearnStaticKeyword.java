package learnJavaConcepts;

public class LearnStaticKeyword {

	static int a=10;
	int b=20;
	
	static void m1() {
		System.out.println("This is a Static method");
	}
	 void m2() {
		System.out.println("This is a non-Static method");
	}
	 void m3() { //non static method can access a static/non static variables and methods directly
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
	 }
	public static void main(String[] args) {
		System.out.println(a);
		 m1();
		 
		 // but if static variable a and method m1 is called through another class use classname.varname/classname.methodname. 
//		 LearnStaticKeyword.a ;
//		 LearnStaticKeyword.m1(); //still no object is required for static method.
		 LearnStaticKeyword S = new LearnStaticKeyword();
		 System.out.println(S.b);
		 S.m2();
		 
		 S.m3();

	}

}


//example of static is println

//class test() {
//	static String s = "hello";
//}
//test.s.length(); -->length is a method of string.
//class System() {

//	static printStream out;

//	static void println() {
//		
//	}
//}
//System.out.println(); -- > classname[system].variable[out].method[println]

