package ����ģʽ;

import java.lang.reflect.Proxy;

import ����ģʽ.�ӿ�.Subject;
import ����ģʽ.�ӿ�.impl.RealSubject;

public class Test {
	public static void main(String[] args) {
		// ��ʵ����
		Subject realSubject = new RealSubject();

		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
		// �������
		Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
				new Class[] { Subject.class }, myInvocationHandler);

		proxyClass.sellBooks();

		proxyClass.speak();
	}
}
