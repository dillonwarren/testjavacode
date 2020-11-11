
public class classesandobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person john = new person("john", 20);
		System.out.println(john.name);
		System.out.println(john.age);
		john.setAge(21);
		System.out.println(john.age);
		person bob = new person ("bob", 45);
		john.sayHelloTo(bob);
		
	

	}

}
