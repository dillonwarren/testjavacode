package ooppractice;

public class headphone {
	
	String charge = "micro usb";
	String[] controls = {"power", "volume", "skip", "play/pause"};
	String color = "Red/black";
	static int volume = 0;
	
	static boolean power = false;
	
	public static void powerOn(){
		power = true;
	}
	
	public static void powerOff() {
		power = false;
	}
	
	public static void volumeUp() {
		volume++;
	}
	public static void volumeDown() {
		volume--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
