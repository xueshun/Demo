package proxy;

/**
 * 代理模式的应用场景
 * @author Administrator
 *  如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种方法
 *  	1.修改原有的方法来适应。这种违反了“对扩展开放，对修改关闭的原则”。
 *  	2.就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
 *  	使用代理模式。可以将功能划分的更清晰，有助于后期维护
 */
public class ProxyTest {
	public static void main(String[] args) {
		Sourceable source = new Proxy(); 
		source.method();
	}
}
