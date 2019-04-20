package 单例模式;

/**
 * 
 * @author 23853 懒汉模式:太懒了,只有在需要的时候才创建实例
 * 
 */
public class SingletonLanHan {

	// 1.私有化构造方法
	private SingletonLanHan() {

	}

	// 2.声明类的唯一实例
	private static SingletonLanHan singletonLanHan;

	// 3.提供一个用于获取实例的方法
	public static SingletonLanHan getInstance() {
		if (singletonLanHan == null) {
			singletonLanHan = new SingletonLanHan();
		}
		return singletonLanHan;
	}

}
