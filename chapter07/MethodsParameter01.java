 
public class MethodsParameter01{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA obj = new AA();
		obj.swap(a,b);
		System.out.println("main函数里的值:" + "a=" + a + "b=" + b);
	}
}
class AA{
	public void swap(int a,int b){
		System.out.println("swap函数交换之前的值:" + "a=" + a + "b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap函数交换之后的值:" + "a=" + a + "b=" + b);
	}
}