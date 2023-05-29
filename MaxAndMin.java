package day1;

import java.util.Scanner;

public class MaxAndMin {

	public static int[] getMinMax(int[] a,int n) {
		int max=0,min=0;
		if(n==1) {
			min=a[0];max=a[0];
			return new int[] {min,max};
		}
		else if(a[0]>a[1]) {
			max=a[0];
			min=a[1];
		}
		else {
			min=a[0];max=a[1];
		}
		for(int i=2;i<n;i++) {
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		return new int[] {max,min};		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] a= {1,2,3,4,5};
		int[] res=getMinMax(a,n);
		System.out.println("min = "+res[1]+" max =  "+res[0]);
		
		
	}

}
