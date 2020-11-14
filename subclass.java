package overriding;
// subclass is inheriting all the variables and methods defined in base
public class subclass extends base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass s = new subclass();
		

	}
	public subclass() {
		sayHello();// we are calling the sayHello method defined in base
		
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		//super.sayHello();
		System.out.println("Hi!");
	}

}
