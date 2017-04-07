package factoryModel;

public class FactoryTest {
	public static void main(String[] args) {
		//普通工厂模式
		/*SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();*/
		
		//多个工厂模式
		/*SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();*/
		
		//静态工厂 模式
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
