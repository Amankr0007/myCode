package Basic_Coding;
import java.util.*;
public class Finding_area {
	static Scanner sc = new Scanner(System.in);
		public static void main(String args[])
		{
			rectangleArea();
			squareArea();
			circleArea();
		}
		static void rectangleArea()
		{
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			int area=length*breadth;
			System.out.println("area of rectangle = "+ area);
		}
		static void squareArea()
		{
			int area;
			int side=sc.nextInt();
			area=side*side;
			System.out.println("Area of square = "+ area);
		}
		static void circleArea()
		{
			double area;
			double radius=sc.nextDouble();
			area=3.14*radius*radius;
			System.out.println("Area of circle =" + area);
		}
}
