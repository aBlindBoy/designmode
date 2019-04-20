package 代理模式.接口.impl;

import 代理模式.接口.Subject;

/**
 * 
 * @author 23853
 *
 */
public class RealSubject implements Subject {
	@Override
	public int sellBooks() {
		System.out.println("卖书");
		return 1;
	}

	@Override
	public String speak() {
		System.out.println("说话");
		return "张三";
	}
}