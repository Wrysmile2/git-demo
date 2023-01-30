import java.util.Scanner;
public class switchExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩:");
		double score = input.nextDouble();
		switch((int)(score/60)){
			case 0:System.out.println("不及格");break;
			case 1:System.out.println("及格");break;
		}
	}
}