package day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PushingZeros {

	public static void push(int[] a) {
		Set<Integer> nonzeroset=new LinkedHashSet<>();
		
		for(int b:a) {
			if(b!=0) {
			
				nonzeroset.add(b);
			}
		}
		int index=0;
		for(int num:nonzeroset) {
			a[index++]=num;
		}
		while(index<a.length) {
			a[index++]=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,0,0,9,8};
		System.out.println("before pushing"+Arrays.toString(a));
		push(a);
		System.out.println("after pushing"+Arrays.toString(a));

	}

}
