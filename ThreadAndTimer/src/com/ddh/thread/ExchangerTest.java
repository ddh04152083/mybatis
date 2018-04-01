package com.ddh.thread;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerTest {
      public static void main(String[] args) {
		ExecutorService service= Executors.newCachedThreadPool();
      final Exchanger<String> exchanger=new Exchanger<>();
      service.execute(new Runnable() {
		
		@Override
		public void run() {
			String data1="ddh";
			System.out.println("�߳�"+Thread.currentThread().getName()+"���ڰ�"+data1+"����ȥ");
			try {
				Thread.sleep((long)(Math.random()*10000));
				String data2=(String)exchanger.exchange(data1);
		       System.out.println("�߳�"+Thread.currentThread().getName()+"���ص�����Ϊ:"+data2);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			
			
		}
	});
      service.execute(new Runnable() {
		
		@Override
		public void run() {
		 String data1="123";
		 System.out.println("�߳�"+Thread.currentThread().getName()+"���ڰ�"+data1+"����ȥ");	
			try {
				Thread.sleep((long)(Math.random()*10000));
				String data2=(String)exchanger.exchange(data1);
				System.out.println("�߳�" + Thread.currentThread().getName() + 
						"���ص�����Ϊ" + data2);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	});
      }
}
