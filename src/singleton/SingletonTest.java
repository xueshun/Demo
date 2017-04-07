package singleton;

import java.util.Vector;

/**
 * 采用“影子实例”的方法为单例对象的属性同步更新
 * @author Administrator
 *
 */
@SuppressWarnings("rawtypes")
public class SingletonTest {
	
	private static SingletonTest instance = null;
	private Vector properties = null;
	
	//私有构造方法，防止被实例化
	private SingletonTest(){
		
	}
	
	public Vector getProperties(){
		return properties;
	}
	
	private static synchronized void syncInit(){
		if(instance == null){
			instance = new SingletonTest();
		}
	}
	
	@SuppressWarnings("unused")
	private static SingletonTest getInstance(){
		if(instance == null){
			syncInit();
		}
		return instance;
	}
	
	public void updateProperties(){
		SingletonTest shadow = new SingletonTest();
		properties = shadow.properties;
	}
	
}
