package polymorphism; 

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		
		//1.spring 컨데이터 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
		/* applicationContext.xml파일 로딩 
		-> GenericXmlApplicationContext객체 생성 스프링 컨테이너 구동*/
		
		
		//2.spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		
		//3. Spring 컨테이너를 종료한다.
		factory.close();
		

	}

}
