package polymorphism;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("====> SamsungTV] ��ü ����");
	}
	public void powerOn() {
		System.out.println("SamsungTV-----power on");
	}
	public void powerOff() {
		System.out.println("SamsungTV-----poweroff");
	}
	public void volumeUp() {
		System.out.println("SamsungTV-----volup");
	}
	public void volumeDown() {
		System.out.println("SamsungTV-----voloff");
	}

}
