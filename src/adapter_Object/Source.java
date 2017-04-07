package adapter_Object;

/**
 * 对象的适配器模式
 * @author Administrator
 *	基本思路和类的适配器模式相同，只是将Adapter类作修改，
 *  这次不继承Source类，而是持有Source类的实例，已达到解决兼容性问题
 */
public class Source {
	public void method1(){
		System.out.println("this is original method!");
	}
}
