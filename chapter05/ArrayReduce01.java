import java.util.Scanner;
public class ArrayReduce01{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Scanner input = new Scanner(System.in);
		do{
			for (int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.print("请输入是否缩减数组y/n：");
			char temp = input.next().charAt(0);
			int[] arrNew = new int[arr.length - 1];
			if (temp =='n') {
				break;
			}
			else
			{
				for (int i=0;i<arr.length-1;i++) {
					arrNew[i] = arr[i];
				}
			}
			arr = arrNew;
			if (arr.length == 1) {
				System.out.println(arr[0]);
				System.out.println("不能再次缩减！");
				break;
			}


		}while(true);

	}
}