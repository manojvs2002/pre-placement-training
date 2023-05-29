package day1;

import java.util.Scanner;

public class PofitAndLoss {
	
	public static int maxProfit(int[] a,int n) {
		int maxprofit=0;
		int price=a[0];
		int minvalue=0,profit = 0;
		
		for(int i=0;i<n;i++) {
			if(minvalue>price)
				minvalue=price;
			else
				profit=price-minvalue;
		}
		
		maxprofit=max(maxprofit,profit);
		return maxprofit;
	}

	public static int max(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)
		return a;
		else
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] a= {1,2,3,4,5};
		
		int p=maxProfit(a, n);
		System.out.println(p);

	}

}
