package builder;

import java.util.ArrayList;
import java.util.List;
import factoryModel.MailSender;
import factoryModel.Sender;
import factoryModel.SmsSender;

/**
 * 建造者模式
 * @author Administrator
 * 工厂模式提供的是创建单个类的模式，而建造者模式是讲各种产品集中起来进行管理，用来创建复合对象，所谓复合对象
 * 就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和
 * 
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
