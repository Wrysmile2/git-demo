import java.util.Scanner;
public class switchExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ�:");
		double score = input.nextDouble();
		switch((int)(score/60)){
			case 0:System.out.println("������");break;
			case 1:System.out.println("����");break;
		}
	}
}