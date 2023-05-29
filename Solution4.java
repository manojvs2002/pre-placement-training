package day1;

import java.util.Arrays;

public class Solution4 {
	
	public static int[] plusOne(int[] a) {
		int n=a.length;
		int carry=1;
		
		for(int i=n-1;i>=0;i--) {
			int sum=a[i]+carry;
			a[i]=sum%10;
			carry=sum/10;
		}
		if(carry==1) {
			int res[] =new int[n+1];
			res[0]=1;
			return res;
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {9,9,9};
		int res[]=plusOne(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(res));
		}
		
	}

}
