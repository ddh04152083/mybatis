package com.ddh.sort;

public class Sort {
public static void Bubble_Sort(int k[],int n){
	int temp,count1 = 0,count2=0;
	boolean flag=true;
	for(int i=0;i<n-1&&flag;i++){
		for(int j=n-1;j>i;j--){
			count1++;
			flag=false;
			if(k[j-1]>k[j]){
				count2++;
				temp=k[j-1];
				k[j-1]=k[j];
				k[j]=temp;
				flag=true;
			}
		}
	}
	
	System.out.println("�ܹ�������" + count1+"�Ƚϣ�������"+count2+"���ƶ�");
}
        public static void main(String[] args) {
			int a[]={1,2,6,3,2,5,7,8,8,9};
			Bubble_Sort(a, a.length);
			System.out.println("�����Ľ������:");
			for(int i=0;i<a.length;i++){
				 System.out.print(" "+a[i]);
			}
		}
}
