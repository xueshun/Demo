package adapter_Interface;

/**
 * 接口的适配器模式
 * @author Administrator
 *	接口的适配器是这样的：有时我们写的一个接口中有多个抽象方法，当我们写接口的实现类时，必须实现该接口的
 *  所有方法，这明显有时比较浪费，因为并不是所有的方法我们都需要，有时只需要一部分，此处为了解决这个问题
 *  我们引入了接口的适配器模式，借助于一个抽象类，该抽象类实了该接口，实现所有的方法，而我们不和原始接口
 *  打交道，只和该抽象类取得联系，所以我们写一个类，集成该抽象类，重写我们需要的方法就行
 */
public interface Sourceable {
	public void method1();
	public void method2();
}
