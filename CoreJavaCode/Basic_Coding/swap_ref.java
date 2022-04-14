package Basic_Coding;
import java.util.Scanner;
public class swap_ref {
	static int m;
	static int n;
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         m=sc.nextInt();
         n=sc.nextInt();
        System.out.println("m  n");
        System.out.println(m+","+n);
        swap();
        System.out.println(m+",,,"+n);
    }
    static void swap(){
        int h;
        h=m;
        m=n;
        n=h;
        System.out.println(m+",,"+n);
    }

}
