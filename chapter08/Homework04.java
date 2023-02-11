
public class Homework04{
	public static void main(String[] args) {
		HW03 h1 = new HW03();
		int[] arr = {1,2,3,4,5};
		int[] newArr = h1.copeArr(arr);

		for (int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
	}
}
class HW03{
	public int[] copeArr(int[] oldArr){
		int[] newArr = new int [oldArr.length];
		for (int i=0;i<oldArr.length;i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}