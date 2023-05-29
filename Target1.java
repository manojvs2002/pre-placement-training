package day1;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

class Solution{
	public int[] twoSum(int[] a,int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], i);
			
		}
		for(int i=0;i<a.length;i++) {
		
			int complement = target-a[i];
			
			if(map.containsKey(complement) && map.get(complement)!=i) {
				return new int[] {i,map.get(complement)};
			}
		}
		return null;
	}
}

public class Target1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Solution sol=new Solution();
		int n=scan.nextInt();
		int target=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int[] indices=sol.twoSum(a, target);
		if(indices!=null) {
			System.out.println(indices[0]+"  "+indices[1]);
			
		}
		else {
			System.out.println("no element found");
		}
		

	}

}
