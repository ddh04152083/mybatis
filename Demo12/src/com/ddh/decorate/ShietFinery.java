package com.ddh.decorate;

public class ShietFinery extends Finery {
 public ShietFinery(People people) {
      super(people);
}
 @Override
	public void wearClothing() {
		// TODO �Զ����ɵķ������
		people.wearClothing();
		System.out.println("****������********");
	}
}
