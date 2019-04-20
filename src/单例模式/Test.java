package 单例模式;

/**
 * 
 * @author 23853 作用:保证整个应用程序中类的实例只有一个 类型:恶汉模式 懒汉模式
 */
public class Test {

	public static void main(String[] args) {
		// 饿汉模式
		SingletonEHan SingletonEHan1 = SingletonEHan.getInstnase();
		SingletonEHan SingletonEHan2 = SingletonEHan.getInstnase();
		// 测试两个变量是否来自同一个实例
		System.out.println(SingletonEHan1 == SingletonEHan2);

		// 懒汉模式
		SingletonLanHan singletonLanHan1 = SingletonLanHan.getInstance();
		SingletonLanHan singletonLanHan2 = SingletonLanHan.getInstance();
		System.out.println(singletonLanHan1 == singletonLanHan2);

		/**
		 * 总结: 饿汉模式:加载类的时候比较慢,但运行时获取对象的速度比较快,线程安全
		 * 懒汉模式:加载类的时候比较快,但运行时获取对象的速度比较满,线程不安全
		 */
	}
}
