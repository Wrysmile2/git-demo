
public class VarParameterDetail{
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		T t1 = new T();
		t1.length(arr);
	}
}
class T{
	//细节：可变参数可以很普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	//一个形参列表中只能有一个可变参数
	public void length(int... nums){
		System.out.println("长度="+nums.length);
	}
}