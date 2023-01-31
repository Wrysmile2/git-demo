import java.util.Scanner;
public class HomeWork{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = {20,56,15,23};
		int temp = 0;
		do{
			for (int i=0;i<arr.length;i++) {
				for (int j=i+1;j<arr.length;j++) {
					if (arr[i]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for (int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println("\n");
			System.out.print("是否添加新的数值(y/n):");
			char judge = input.next().charAt(0);
			System.out.println("请输入要添加的数：");
			int num = input.nextInt();
			if (judge == 'y') {
				int[] arr2 = new int[arr.length+1];
				for (int i=0;i<arr.length;i++) {
					arr2[i] = arr[i];
				}
				arr2[arr2.length-1] = num;
				arr = arr2;
			}
			else
			{
				break;
			}

		}while(true);

	}
}
