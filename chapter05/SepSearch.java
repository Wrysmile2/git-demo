
public class SepSearch{
	public static void main(String[] args) {
		int[][] arr = new int[5][];		//������ά���飬����ֻ��ȷ����Ϊ����ĸ���
		for (int i=0;i<arr.length;i++) {	//����arrÿ��һά����
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά���� new ����ôarr[i]����null
			arr[i] = new int[i+1];
			//����һά���鲢��ֵ
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i+1;
			}
		}
		//����arr���
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length ;j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}