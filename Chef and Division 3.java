import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++){
		    
		    int n = s.nextInt();
		    int k = s.nextInt();
		    int d = s.nextInt();
		    int[] A = new int[n];
		    
		    int sum=0;
		    int ans;
		    
		    for(int j=0;j<A.length;j++){
		        A[j] = s.nextInt();
		        sum=sum+A[j];
		    }
		    
		    if(sum<k){
		        ans=0;
		    }
		    else{
		        int r = sum/k;
		        if(r<d){
		            ans=r;
		        }
		        else{ans=d;}
		    }
		    System.out.println(ans);
		}
	}
}
