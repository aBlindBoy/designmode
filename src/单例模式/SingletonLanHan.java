package ����ģʽ;

/**
 * 
 * @author 23853 ����ģʽ:̫����,ֻ������Ҫ��ʱ��Ŵ���ʵ��
 * 
 */
public class SingletonLanHan {

	// 1.˽�л����췽��
	private SingletonLanHan() {

	}

	// 2.�������Ψһʵ��
	private static SingletonLanHan singletonLanHan;

	// 3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static SingletonLanHan getInstance() {
		if (singletonLanHan == null) {
			singletonLanHan = new SingletonLanHan();
		}
		return singletonLanHan;
	}

}
