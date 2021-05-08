package polymorphism; 

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		
		//1.spring �������� ����
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
		/* applicationContext.xml���� �ε� 
		-> GenericXmlApplicationContext��ü ���� ������ �����̳� ����*/
		
		
		//2.spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		
		//3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
		

	}

}
