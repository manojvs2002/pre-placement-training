package day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Launch6 {
	
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		boolean res=containsDuplicate(a);
		System.out.println(res);
	}

}
