package com.ddh.decorate;

public class Xiaoming  implements People{
	private String name;
	public Xiaoming(){
		name="xiaoming";
	}
	@Override
	public void wearClothing() {
		// TODO �Զ����ɵķ������
		System.out.println("��ʼ���·�...");
	}
}
