package Basic_Coding;
import java.util.*;
public class Perfect_number {
	public static void main(String []args){
	     Scanner sc=new Scanner(System.in);
	     int low=sc.nextInt();
	     int high=sc.nextInt();
	     int flag=0;
	     while(high>low)
	     {
	     int i,sum=0;
	     for(i=1;i<=low/2;i++)
	     {
	         if(low%i==0)
	         {
	             sum=sum+i;
	             
	         }
	     }
	     if(sum==low)
	     {
	         System.out.println("perfect no.: "+low);
	         flag=1;
	     }
	     
	     low++;
	     }
	     if(flag==0)
	     {
	    	 System.out.println("not perfect no."); 
	     }
	}

}
