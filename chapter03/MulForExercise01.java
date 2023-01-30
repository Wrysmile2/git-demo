import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args) {
		int i;
		double sum = 0,aver = 0;
		System.out.println("请输入一班成绩：");
		Scanner input = new Scanner(System.in);
		for (i=1 ;i<=5 ;i++ ) {
			System.out.println("请输入成绩：");
			double score = input.nextDouble();
			sum = sum + score;
		}
		aver = sum/5;
		System.out.println("一班总成绩是：" + sum + "一班平均分是:" + aver);
	}	
}