package com.ddh.timer;

import java.util.Date;
import java.util.Timer;

public class MyTimer {
    public static void main(String[] args) {
		new Timer().schedule(new MTimerTask(), 2000);
		while(true)
		{
			System.out.println(new Date().getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}
}
