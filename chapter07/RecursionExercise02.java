import java.util.Scanner;
public class RecursionExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		T t1 = new T();
		System.out.println("��������Ҫ�鿴��������");
		int day = input.nextInt();
		int peachNum = t1.peach(day);
		if (peachNum != -1) {
			System.out.println("��"+day+"����"+peachNum+"����");
		}
	}
}
class T{
	public int peach(int day){
		if (day==10) {
			return 1;
		}else if (day>=1 && day<=9) {
			return (peach(day+1)+1)*2;
		}else{
			System.out.println("day��1-10");
			return -1;
		}
	}
}