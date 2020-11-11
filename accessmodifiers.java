
public class accessmodifiers {
	
	//private, defualt, protected, public most-least restrictive.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void doSomethingpublic() {
		//anywhere in the program as long as you have an instance to call it from
	}
	
	private void doSomethingPrivate() {
		// not visible outside of this class
	}
	
	protected void doSomethigngProtected() {
		//this method can only be accessed inside of this package, and by subclasses of this class
	}
	void doSomething() {
		//this method can only be accessed inside of this package
	}

}
