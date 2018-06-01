package theFinalPackage;

public class TheFinalClass {

	public static void main(String[] args) {

	}

}

class NotSoFinal {
	final int myInt = 0;
	final String str = "This will not work!";

	final void myMethod(int i, String s) {

		this.myInt = i; // cannot be modified, because myInt is final
		this.str = s; // cannot be modifies, because str is final

	}

	// final method
	final void someFinalMethod() {
		System.out.println("this is a final method");
		System.out.println("I'm a final method and I can be overloaded.");
	}

	// overloaded methods
	final void myOtherMethod(String a) {
		System.out.println("a is: " + a);
		System.out.println("I'm a final method and I can be overloaded.");
	}

	final void myOtherMethod(String a, String b) {
		System.out.println("a and b are: " + a + b);
		System.out.println("I'm a final method and I can be overloaded.");
	}

	final void myOtherMethod(int i, char c) {
		System.out.println(i + c);
		System.out.println("I'm a final method and I can be overloaded.");
	}

}

class probablyNotFinal extends NotSoFinal {

	int someFinalMethod() {
		return 1; // can't overload a final method
	}

}

final class DefenitelyAFinalClass {
	int i = 6;
	String s = "a not so final String";
}

class CannotExtendFinal extends DefenitelyAFinalClass {
	// final classes cannot be extended!
}

abstract class MyOhSoAbstractClass { // in case it's not obvious: this class is abstract!

	abstract void vagueMethodOne();

	void myNotAbstractMethod() {
		System.out.println("I'm not an abstract method and therefore I have a body!");
	}

}

class AbstractChild extends MyOhSoAbstractClass {

	@Override
	void vagueMethodOne() {
		System.out.println("I'm a method that overrides an abstact method from my parent class");

	}

}
