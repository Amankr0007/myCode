package Basic_Coding;
import java.util.Scanner;

public class swap_2_number {
	static int m;
	static int n;
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         m=sc.nextInt();
         n=sc.nextInt();
        System.out.println("m  n");
        System.out.println(m+" "+n);
        swap();
        System.out.println(m+" "+n);
        sc.close();
    }
    static void swap(){

    			m=m+n ;
    			n=m-n ;       
    			m=m-n ;
    }
}
