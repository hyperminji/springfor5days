package polymorphism;

public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LgTV-----on");
	}
	public void powerOff() {
		System.out.println("LgTV-----off");
	}	
	public void volumeUp() {
		System.out.println("LgTV-----volup");
	}
	public void volumeDown() {
		System.out.println("LgTV-----voldown");
	}
}
