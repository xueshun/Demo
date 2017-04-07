package adapter_Class;

/**
 * 适配器模式
 * @author Administrator
 * 适配器模式将某个类的接口转化成客户端期望的另一个接口表示
 * 目的是消除由于接口不匹配所造成的类兼容性问题。
 * 主要分为三类:类的适配器模式 对象的适配器模式 接口的适配器模式
 * 
 * 	类的适配器模式
 * 		核心思想就是:有一个Source类，拥有一个方法，待适配，目标接口
 * 		时Targetale,通过Adapter类，将Source的功能扩展到Targetable里
 */
public class Source {
	
	public void method1(){
		System.out.println("this is original method!");
	}
}
