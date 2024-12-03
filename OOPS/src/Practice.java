import java.util.*;
public class Practice {

	public static void method(int[] arr, int val) {
		
		int i=0;
		int j =0;
		while(j<arr.length) {
			if(arr[j]!=val) {
				arr[i]=arr[j];
				i++;
			}
			j++;
		}
		for(int k=0;k<arr.length;k++) {
		  System.out.print(arr[k]+" ");
		}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar1 = {0,1,2,2,3,0,4,2};
		int val = 2;
		
		
		method(ar1,val);

        // Print the resulting array
        
	}
}
