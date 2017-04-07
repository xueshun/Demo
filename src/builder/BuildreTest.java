package builder;

/**
 * 从这点看出，建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西，
 * 多以与工程模式区别的就是工厂模式，
 * 工厂模式关注的是创建单品，而建造者模式则关注创建复合对象，多个部分。
 * 
 * @author Administrator
 *
 */
public class BuildreTest {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
