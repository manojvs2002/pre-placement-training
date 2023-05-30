package day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingMissingNumber8 {
	
	//private static final char[]  = null;

	public static int[] find(int[] a) {
		int res[]=new int[2];
		Set<Integer> setno=new HashSet<>();
		int duplicate=0;
		int n=a.length;
		long sum=(n*(n+1))/2;
		
		for(int num:a) {
			if(!setno.add(num)) {
				duplicate=num;
			}
			sum-=num;
		}
	res[0]=duplicate;
	res[1]=(int) (duplicate+sum);	
	return res;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1, 2, 2, 4};
		int res[]=find(a);
		System.out.println(res[0]+"   "+res[1]);
	}

}
