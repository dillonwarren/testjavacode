package youtubestuff;
// recursion is when A method is called inside of itself
// need a base case to tell it when to stop

public class recursion {

	public static void main(String[] args) {
		sayHi(5);
		countBackwards(14);

	}
	
	public static void countBackwards(int n) {
		if (n==0) {
			System.out.println("Done");
		}else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}
	
	public static void sayHi(int n) {
		if(n == 0) {
			System.out.println("Done");
		}else {
			System.out.println("Hi");
			n--;
			sayHi(n);
		}
		
	}

}
