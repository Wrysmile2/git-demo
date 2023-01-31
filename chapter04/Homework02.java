import java.util.Scanner;
public class Homework02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double n = input.nextDouble();
		if (n>0) {
			System.out.println(n + "大于零");
		}
		else if (n<0) {
			System.out.println(n + "小于零");
		}
		else 
		{
			System.out.println(n + "等于零");
		}

	}
}