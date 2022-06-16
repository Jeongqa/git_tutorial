package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBeanEn();
		messageBean.sayHello("Spring");
		
		messageBean = new MessageBeanKo();
		messageBean.sayHello("스프링");
	}

}
