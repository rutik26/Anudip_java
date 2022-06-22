package lab1606;

import java.util.Scanner;
import java.util.Arrays;

public class duplicate {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		int[]arr = {2,3,4,1,2,3};
		Arrays.sort(arr);
		
		int l=arr.length;
		int[]temparr =new int[l];
		int j= 0;
		
		for(int i=0;i<l-1;i++) {
			if(arr[i] != arr[i+1]) {
				temparr[j++] = arr[i];
			}
		}
		temparr[j++]=arr[l-1];

		
		for (int i=0;i<j;i++) {
			System.out.print(temparr[i]+" ");
		}
	}
}
