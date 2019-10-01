import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		while(tests-->0){
		    int[] a = new int[s.nextInt()];
		    for(int i=0;i<a.length;i++){
		        a[i] = s.nextInt();
		    }
		    compute(a);
		}
	}
	
	public static void compute(int[] a){
	    int localsum = 0;
	    int globalsum = -999999;
	    for(int i=0;i<a.length;i++){
	        localsum = Math.max(a[i],a[i]+localsum);
	        if(localsum>globalsum){
	            globalsum = localsum;
	        }
	    }
	    System.out.println(globalsum);
	}
}
