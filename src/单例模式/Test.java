package ����ģʽ;

/**
 * 
 * @author 23853 ����:��֤����Ӧ�ó��������ʵ��ֻ��һ�� ����:��ģʽ ����ģʽ
 */
public class Test {

	public static void main(String[] args) {
		// ����ģʽ
		SingletonEHan SingletonEHan1 = SingletonEHan.getInstnase();
		SingletonEHan SingletonEHan2 = SingletonEHan.getInstnase();
		// �������������Ƿ�����ͬһ��ʵ��
		System.out.println(SingletonEHan1 == SingletonEHan2);

		// ����ģʽ
		SingletonLanHan singletonLanHan1 = SingletonLanHan.getInstance();
		SingletonLanHan singletonLanHan2 = SingletonLanHan.getInstance();
		System.out.println(singletonLanHan1 == singletonLanHan2);

		/**
		 * �ܽ�: ����ģʽ:�������ʱ��Ƚ���,������ʱ��ȡ������ٶȱȽϿ�,�̰߳�ȫ
		 * ����ģʽ:�������ʱ��ȽϿ�,������ʱ��ȡ������ٶȱȽ���,�̲߳���ȫ
		 */
	}
}
