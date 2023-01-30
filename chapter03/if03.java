import java.util.Scanner;
public class if03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分(1~100)：");
		int grade = myScanner.nextInt();
		if(grade>=0  && grade<=100)
		{
			if (grade == 100) {
				System.out.println("信用极好");
			}
			else if (grade>80 && grade<=90) {
				System.out.println("信用优秀");
			}
			else if (grade>=60 && grade<=80) {
				System.out.println("信用一般");
			}
			else
			{
				System.out.println("信用不好");
			}
		}
		else
		{
			System.out.println("信用分要在1~100之间，请重新输入");
		}
		
	}
}