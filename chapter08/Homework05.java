import java.util.Scanner;
public class Homework05{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入半径：");
		double radius = input.nextDouble();
		System.out.println("周长是："+c1.girth(radius));
		System.out.println("面积是："+c1.area(radius));
	}
}
class Circle{
	public double girth(double radius){
		double girth = Math.PI*radius*2;
		return girth;
	}
	public double area(double radius){
		double area = Math.PI*radius*radius;
		return area;
	}
}