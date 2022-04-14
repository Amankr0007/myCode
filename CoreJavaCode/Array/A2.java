/*Write a C program to check a given array of integers of length 1 or more and 
return true if the first element and the last element are equal in the given array.
*/
package Array;
import java.util.*;
public class A2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	if(a[0]==a[n-1])
	{
		System.out.print("true");
		
	}
	else
	{
		System.out.print("false");
		
	}
}

}
