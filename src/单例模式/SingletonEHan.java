package ����ģʽ;

/**
 * 
 * @author 23853 
 * ����ģʽ:������ص�ʱ��ͼ���,������ʱ��û�Ա�����Ҫ���ٳԱ�,����ĳ�֮Ϊ����ģʽ
 */
public class SingletonEHan {

	// 1.�����췽��˽�л�,�������ⲿֱ�ӷ���
	private SingletonEHan() {

	}

	// 2.�������Ψһʵ��
	private static SingletonEHan singleton = new SingletonEHan();

	// 3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static SingletonEHan getInstnase() {
		return singleton;
	}

	
	
}
