package Lec_08;
import java.util.*;
public class subarray_sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
			}		
			System.out.println(sum);
		}		
	}
}
