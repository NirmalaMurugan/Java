package week1.day3;

import java.util.Arrays;

public class CompareStringArray {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7}; 
		 int b[]={1,2,8,4,9,7};
		 
		 if(a.length==b.length) {
		 Arrays.sort(a);
		 Arrays.sort(b);
		 System.out.println("Match is found");
		 for (int i=0;i<a.length;i++) {
			 for (int j=0;j<b.length;j++)
			 {	
				 
				 if(a[i]==b[j])
				 {
					 System.out.println(a[i]);
					 
				 }
			 }
		 }
		 }
		 else
		 {
			 System.out.println("The given arrays are of different length");
		 }

	}

}