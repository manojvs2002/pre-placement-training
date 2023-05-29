package day1;

import java.util.Arrays;

public class Launch5 {
	
	public static void mergesort(int[] a,int[] left,int right[]) {
		int i=0,j=0,k=0;//for arrays a,left,right respectively
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				a[k++]=left[i++];
			}
			else {
				a[k++]=right[j++];
			}
		}
		
		while(i<left.length) {
			a[k++]=left[i++];
		}
		
		while(j<right.length) {
			a[k++]=right[j++];
		}
	}
	
	
	
	static void merge(int[] complete) {
		int n=complete.length;
		int mid=complete.length/2;
		
		int[] left=new int[mid];
		int[] right = new int[complete.length-mid];
		
		for(int i=0;i<n;i++) {
			left[i]=complete[i];
		}
		for(int i=0;i<n;i++) {
			right[i-mid]=complete[i];
		}
		
		merge(left);
		merge(right);
		
		mergesort(complete,left,right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,0,0,0};
		int[] b= {2,5,6};
		int complete[] = new int[10];
		
		
		
		
		
		mergesort(complete,a,b);
		System.out.println("after adding and sorting");
		System.out.println(Arrays.toString(complete));

	}

}
