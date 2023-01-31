
public class SepSearch{
	public static void main(String[] args) {
		int[][] arr = new int[5][];		//创建二维数组，但是只是确定以为数组的个数
		for (int i=0;i<arr.length;i++) {	//遍历arr每个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组 new ，那么arr[i]就是null
			arr[i] = new int[i+1];
			//遍历一维数组并赋值
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i+1;
			}
		}
		//遍历arr输出
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length ;j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}