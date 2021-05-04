package polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====> SamsungTV] 按眉 积己");
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() call");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() call");
		this.price = price;
	}
	
	
	
	/*public SamsungTV(Speaker speaker) {
		System.out.println("====> SamsungTV(2)  按眉 积己");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 按眉 积己");
		this.speaker = speaker;
		this.price = price;
	}*/
	public void powerOn() {
		System.out.println("SamsungTV-----power on(啊拜 " + price +")" );
	}
	public void powerOff() {
		System.out.println("SamsungTV-----poweroff");
	}
	public void volumeUp() {
		//speaker = new SonySpeaker();
		speaker.volumeUp();
		//System.out.println("SamsungTV-----volup");
	}
	public void volumeDown() {
		//speaker = new SonySpeaker();
		speaker.volumeDown();
		//System.out.println("SamsungTV-----voloff");
	}

}
