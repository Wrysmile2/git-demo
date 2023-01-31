
public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {12,56,84,43,65,48,23,8,40,15};
		int len = arr.length;
		int temp;
		for (int i=0;i<len;i++ ) {
			for(int j=i+1;j<len;j++){
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k=0;k<len;k++ ) {
			System.out.print(arr[k] + " ");
		}
	}
}