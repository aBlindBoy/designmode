package ����ģʽ.�ӿ�.impl;

import ����ģʽ.�ӿ�.Subject;

/**
 * 
 * @author 23853
 *
 */
public class RealSubject implements Subject {
	@Override
	public int sellBooks() {
		System.out.println("����");
		return 1;
	}

	@Override
	public String speak() {
		System.out.println("˵��");
		return "����";
	}
}