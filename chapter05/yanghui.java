import java.util.Scanner;
public class yanghui{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要打印的行数：");
		int row = input.nextInt();
		int arr[][] = new int[row][];
		for (int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			for (int j=0;j<arr[i].length;j++) {
				if (j==0 || j==arr[i].length-1) {
					arr[i][j] = 1;
				}
				else
				{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println('\n');
		}
	}
}