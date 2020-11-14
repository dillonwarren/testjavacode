package ooppractice;

public class Main {

	public static void main(String[] args) {
		pen p = new pen();
		
		
		System.out.println(p.color);
		System.out.println(p.point);
		System.out.println(p.type);
		
		System.out.println(p.clicked);
		
		p.click();
		
		System.out.println(p.clicked);
		
		headphone b = new headphone();
		
		System.out.println(b.charge);
		System.out.println(b.color);
		System.out.println(b.power);
		System.out.println(b.volume);
		b.volumeUp();
		System.out.println(b.volume);
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		b.volumeUp();
		System.out.println(b.volume);

	}

}
