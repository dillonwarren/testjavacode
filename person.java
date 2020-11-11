
public class person {
	
	String name;
	int age;
	
	public person(String name, int age ) {
		this.name = name;
		this.age = age;
	System.out.println("person created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sayHelloTo(person person) {
		System.out.println(getName() + " said hello to " + person.getName());
	}

}
