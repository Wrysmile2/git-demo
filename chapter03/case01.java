import java.util.Scanner;
public class case01{
	public static void main(String[] args) {
		System.out.println("输出月份：");
		Scanner myScanner = new Scanner(System.in);
		int mouth = myScanner.nextInt();
		if (mouth>=4 && mouth<=10) {
			System.out.println("输出年龄：");
			Scanner  input = new Scanner(System.in);
			int age = input.nextInt();
			if (age > 60) {
				System.out.println("票价20");
			}else if (age < 18) {
				System.out.println("票价30");
			}else{
				System.out.println("票价60");
			}
		}
		else{
			System.out.println("输出年龄：");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if(age>18 && age<60){
				System.out.println("票价60");
			}
			else{
				System.out.println("票价20");
			}
		}
	}
}