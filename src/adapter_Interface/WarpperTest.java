package adapter_Interface;

/**
 * 类的适配器模式：当希望一个类转化成满足另一个新接口的类是，可以
 * 	使用类的适配器模式，创建一个新类，实现新的接口即可
 * 
 * 对象的适配器：当希望将一个对象转成满足另一个新接口的对象是，可以创建一个Wrapper类，持有源类的一个实例，
 *   在Wrapper类的方法中，调用实例的方法就行
 *   
 * 接口的适配器模式： 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有的方法，我们
 *   写别的类的时候，集成抽象类即可
 * 
 */
public class WarpperTest {
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		source1.method1();
		source2.method2();
		source2.method2();
	}
}
