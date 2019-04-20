package 单例模式;

/**
 * 
 * @author 23853 
 * 饿汉模式:在类加载的时候就加载,启动的时候没吃饱所以要快速吃饱,形象的称之为饿汉模式
 */
public class SingletonEHan {

	// 1.将构造方法私有化,不允许外部直接访问
	private SingletonEHan() {

	}

	// 2.创建类的唯一实例
	private static SingletonEHan singleton = new SingletonEHan();

	// 3.提供一个用于获取实例的方法
	public static SingletonEHan getInstnase() {
		return singleton;
	}

	
	
}
