import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args) {
		int i;
		double sum = 0,aver = 0;
		System.out.println("������һ��ɼ���");
		Scanner input = new Scanner(System.in);
		for (i=1 ;i<=5 ;i++ ) {
			System.out.println("������ɼ���");
			double score = input.nextDouble();
			sum = sum + score;
		}
		aver = sum/5;
		System.out.println("һ���ܳɼ��ǣ�" + sum + "һ��ƽ������:" + aver);
	}	
}