import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		System.out.println("请输入您的成绩：\n");
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();
		if (score>8.0) {
			System.out.println("请输入性别");
			char genter = myScanner.next().charAt(0);
			if (genter == '男') {
				System.out.println("进入男子组");
			}else if (genter == '女') {
				System.out.println("进入女子组");
			}else{
				System.out.println("你性别有误，不能参加决赛");
			}

		}
		else
		{
			System.out.println("sorry，你被淘汰了~");
		}

	}
} 