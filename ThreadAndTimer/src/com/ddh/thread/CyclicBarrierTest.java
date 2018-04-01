package com.ddh.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
   public static void main(String[] args) {
    ExecutorService  service=Executors.newCachedThreadPool();
    final CyclicBarrier cb=new CyclicBarrier(3);
    for(int i=0;i<3;i++){
    	Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep((long)(Math.random()*10000));	
					System.out.println("�߳�"+Thread.currentThread().getName()
							+"�������Ｏ�ϵص�1����ǰ����"+ (cb.getNumberWaiting() + 1)
					+ "������" + (cb.getNumberWaiting()==2?"�������ˣ�������ѽ":"���ڵȺ�"));
					cb.await();
					
					Thread.sleep((long)(Math.random()*10000));
					System.out.println("�߳�"+Thread.currentThread().getName()+"�������Ｏ�ϵص�2����ǰ����"+(cb.getNumberWaiting()+1)
					+"������"+(cb.getNumberWaiting()==2?"�������ˣ�������ѽ":"���ڵȺ�"));
					cb.await();
					Thread.sleep((long)(Math.random()*10000));
					System.out.println("�߳�"+Thread.currentThread().getName()+"�������Ｏ�ϵص�3����ǰ����"+(cb.getNumberWaiting()+1)
					+"������"+(cb.getNumberWaiting()==2?"�������ˣ�������ѽ":"���ڵȺ�"));
					cb.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
			}
		};
		service.execute(runnable);
		
    }
    service.shutdown();
}
}
