import java.util.Scanner;
public class Array01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = {1,2,3};
		do
		{
			int[] arrNew = new int[arr.length+1];
			for (int i=0;i<arr.length;i++) {
			 	arrNew[i] = arr[i];
			 } 
			System.out.println("��������Ҫ��ӵ�Ԫ��");
			int addnum = input.nextInt();
			arrNew[arrNew.length-1] = addnum;
			arr = arrNew;
			System.out.println("=====arr����֮��Ԫ�����=====");
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i] + "\t");
			}
			System.out.println("�Ƿ�������Y/N");
			char key = input.next().charAt(0);
			if (key == 'N') {
				break;
			}
		}while(true);

	}
}