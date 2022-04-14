package Basic_Coding;
import java.util.*;
public class swap {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("m  n");
        System.out.println(m+","+n);
        swap(m,n);
        System.out.println(m+",,,"+n);
    }
    static void swap(int m ,int n){
        int h;
        h=m;
        m=n;
        n=h;
        System.out.println(m+",,"+n);
    }

}
