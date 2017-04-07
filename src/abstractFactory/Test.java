package abstractFactory;

/**
 * 抽象工厂模式  这个模式的好处就是，如果现在想增加一个功能： 发及时心思，则只需做一个实现类，实现
 * Sender接口，同时做一个工厂类，实现Provider接口，就可以了，无需去改动现成的代码。这样做拓展性较好
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
