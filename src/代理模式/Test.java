package 代理模式;

import java.lang.reflect.Proxy;

import 代理模式.接口.Subject;
import 代理模式.接口.impl.RealSubject;

public class Test {
	public static void main(String[] args) {
		// 真实对象
		Subject realSubject = new RealSubject();

		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
		// 代理对象
		Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				new Class[] { Subject.class }, myInvocationHandler);

		proxyClass.sellBooks();

		proxyClass.speak();
	}
}
