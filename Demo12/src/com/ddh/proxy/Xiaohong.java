package com.ddh.proxy;

public class Xiaohong implements People {

	private People people;
	public Xiaohong(People people){
		this.people=people;
	}
	@Override
public void buyFood() {
	// TODO �Զ����ɵķ������
	System.out.println("�����ȥ��");
	people.buyFood();
}
}
