package ����ģʽ;

import ����ģʽ.�ӿ�.Impl.HuaWeiItem;
import ����ģʽ.�ӿ�.Impl.XiaoMiItem;

/**
 * �ڲ���ģʽ��Strategy Pattern���У�һ�������Ϊ�����㷨����������ʱ���ġ��������͵����ģʽ������Ϊ��ģʽ��
 * �ڲ���ģʽ�У����Ǵ�����ʾ���ֲ��ԵĶ����һ����Ϊ���Ų��Զ���ı���ı�� context ���󡣲��Զ���ı� context �����ִ���㷨��
 * ��ͼ������һϵ�е��㷨,������һ������װ����, ����ʹ���ǿ��໥�滻��

��Ҫ��������ж����㷨���Ƶ�����£�ʹ�� if...else �������ĸ��Ӻ�����ά����

��ʱʹ�ã�һ��ϵͳ���������࣬���������ǵ�ֻ������ֱ�ӵ���Ϊ��

��ν��������Щ�㷨��װ��һ��һ�����࣬������滻��

�ؼ����룺ʵ��ͬһ���ӿڡ�
Ӧ��ʵ���� 1��������Ľ�����ƣ�ÿһ�����Ҿ���һ�����ԡ� 2�����еĳ��η�ʽ��ѡ�������г�����������ÿһ�����з�ʽ����һ�����ԡ� 3��JAVA AWT �е� LayoutManager��

�ŵ㣺 1���㷨���������л��� 2������ʹ�ö��������жϡ� 3����չ�����á�
ȱ�㣺 1������������ࡣ 2�����в����඼��Ҫ���Ⱪ¶��

ʹ�ó����� 1�������һ��ϵͳ����������࣬����֮���������������ǵ���Ϊ����ôʹ�ò���ģʽ���Զ�̬����һ�������������Ϊ��ѡ��һ����Ϊ�� 2��һ��ϵͳ��Ҫ��̬���ڼ����㷨��ѡ��һ�֡� 3�����һ�������кܶ����Ϊ���������ǡ����ģʽ����Щ��Ϊ��ֻ��ʹ�ö��ص�����ѡ�������ʵ�֡�

ע��������һ��ϵͳ�Ĳ��Զ����ĸ�������Ҫ����ʹ�û��ģʽ��������������͵����⡣
 * @author 23853
 *
 */
public class Test {

	public static void main(String[] args) {
		// �������Ҫʵ�����ֲ���
		Context huawei = new Context(new HuaWeiItem());
		// ִ�н��۴���
		int executeDepreciate = huawei.executeDepreciate(800, 100);
		System.out.println("��Ϊ��Ʒ����100Ԫ֮��ļ۸� = " + executeDepreciate);
		// ִ�д��۴���
		float executeDiscount = huawei.executeDiscount(800, 0.9f);
		System.out.println("��Ϊ��Ʒ���۴�0.9��֮��ļ۸� = " + executeDiscount);
		System.out.println("========================================");
		Context xiaomi = new Context(new XiaoMiItem());
		int executeDepreciate2 = xiaomi.executeDepreciate(1000, 80);
		float executeDiscount2 = xiaomi.executeDiscount(1000, 0.9f);
		System.out.println("С����Ʒ����100Ԫ֮��ļ۸� = " + executeDepreciate2);
		System.out.println("С����Ʒ��0.9��֮��ļ۸� = " + executeDiscount2);

		
		
		
	}
}
