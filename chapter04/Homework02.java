import java.util.Scanner;
public class Homework02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		double n = input.nextDouble();
		if (n>0) {
			System.out.println(n + "������");
		}
		else if (n<0) {
			System.out.println(n + "С����");
		}
		else 
		{
			System.out.println(n + "������");
		}

	}
}