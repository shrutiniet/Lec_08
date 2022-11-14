package Lec_08;
import java.util.*;
public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int rot=sc.nextInt();
		if(rot>n)
			rot=n%rot;
		Solve(arr,rot);
	}
	public static void Solve(int[]arr, int rot)
	{
		for(int i=1;i<=rot;i++)
		{
			Rotate_Once(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void Rotate_Once(int[]arr)
	{
		int tmp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=tmp;
	}
}
