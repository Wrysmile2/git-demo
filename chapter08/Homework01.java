
public class Homework01{
	public static void main(String[] args) {
		double[] arr = {5.1,2.2,3.3,4.4};
		int sz = arr.length;
		HW01 h1 = new HW01();
		
		System.out.println("arr数组中最大的数是：" + h1.max(arr,sz));
	}
}

class HW01{
	public double max(double[] arr,int sz){
		double max = arr[0];
		for (int i=1;i<sz;i++) {
			if (max>arr[i]) {
				max = max;
			}else{
				max = arr[i];
			}	
		}
		return max;
	}
}