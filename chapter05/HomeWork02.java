
public class HomeWork02{
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("====arr��Ԫ�����====");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");
		System.out.println("====arr��Ԫ���������====");
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + "\t");
		}
		double sum = 0;
		int max = arr[0];
		int maxindex = 0;
		for (int i=0;i<arr.length ;i++ ) {
			if (max<arr[i]) {
				max = arr[i];
				maxindex = i;
			}
		}
		System.out.println("\n");
		System.out.println("���ֵ��" + max + "�±��ǣ�" + maxindex);


	}
}