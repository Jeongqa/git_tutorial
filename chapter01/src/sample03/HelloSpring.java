package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean messageBean = context.getBean("messageBean",MessageBean.class); //자식클래스는 부모클래스를 캐스팅할수 없다.(다운캐스팅해야함)
		messageBean.sayHello("Spring");
		System.out.println("------------------------");
		
		MessageBean messageBean2 = (MessageBean)context.getBean("messageBean"); //자식클래스는 부모클래스를 캐스팅할수 없다.(다운캐스팅해야함)
		messageBean2.sayHello("Spring");
		System.out.println("------------------------");
		
		MessageBean messageBean3 = (MessageBean)context.getBean("messageBean"); //자식클래스는 부모클래스를 캐스팅할수 없다.(다운캐스팅해야함)
		messageBean3.sayHello("Spring");
		System.out.println("------------------------");
		//스프링 설정 파일에 가서 Bean을 얻어와라
	}

}
