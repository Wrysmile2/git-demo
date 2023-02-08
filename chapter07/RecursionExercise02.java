import java.util.Scanner;
public class RecursionExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		T t1 = new T();
		System.out.println("请输入想要查看的天数：");
		int day = input.nextInt();
		int peachNum = t1.peach(day);
		if (peachNum != -1) {
			System.out.println("第"+day+"天有"+peachNum+"桃子");
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
			System.out.println("day在1-10");
			return -1;
		}
	}
}