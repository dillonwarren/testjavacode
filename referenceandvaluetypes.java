
public class referenceandvaluetypes {
	
	//byte,short,int,long,float,double,char, boolean

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		addOneTo(x);
		System.out.println(x);
		person john;
		john = new person("john", 20);
		celebrateBirthday(john);
		System.out.println(john.getAge());
		
		

	}
	
	private static void celebrateBirthday(person john) {
		john.setAge(john.getAge() + 1);
		
	}

	static void addOneTo(int number) {
		number = number + 1;
	}

}
