package ����ģʽ;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import ����ģʽ.�ӿ�.Subject;

/**
 * ����һ��������
 * 
 * @author 23853
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	/**
	 * ��Ϊ��Ҫ������ʵ��ɫ������Ҫ����ʵ��ɫ������
	 */
	Subject realSubject;

	public MyInvocationHandler(Subject realSubject) {
		this.realSubject = realSubject;
	}

	/**
	 *
	 * @param proxy
	 *            ������
	 * @param method
	 *            ���ڵ��õķ���
	 * @param args
	 *            �����Ĳ���
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���ô�����");
		if (method.getName().equals("sellBooks")) {
			int invoke = (int) method.invoke(realSubject, args);
			System.out.println("���õ�������ķ���");
			return invoke;
		} else {
			String string = (String) method.invoke(realSubject, args);
			System.out.println("���õ���˵���ķ���");
			return string;
		}
	}
}