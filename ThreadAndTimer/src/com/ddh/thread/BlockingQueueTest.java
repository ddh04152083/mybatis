package com.ddh.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
      public static void main(String[] args) {
		BlockingQueue  queue=new ArrayBlockingQueue(3);
		for(int i=0;i<2;i++){
			new Thread(){
				@Override
				public void run() {
				 	 while(true){
				 		 try {
							Thread.sleep((long)(Math.random()*100));
							System.out.println(Thread.currentThread().getName()+"׼�������");
							queue.put(1);
							System.out.println(Thread.currentThread().getName()+"�Ѿ���������,"+"����Ŀǰ��"+queue.size()+"������");
							
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
							e.printStackTrace();
						}
				 	 }
				}
			}.start();
		}
		new Thread(){
			@Override
			public void run() {
			 	 while(true){
			 		 try {
						Thread.sleep((long)(Math.random()*1000));
						System.out.println(Thread.currentThread().getName()+"׼�������");
						queue.take();
						System.out.println(Thread.currentThread().getName()+"�Ѿ���������,"+"����Ŀǰ��"+queue.size()+"������");
						
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
			 	 }
			}
		}.start();
	}
}
