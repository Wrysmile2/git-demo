
public class Recursion01{
	public static void main(String[] args) {
		T t1 = new T();
		t1.test(4); 
		int sum = t1.factorial(5);
		System.out.println("sum="+sum);
	}
}
class T{
	public void test(int n){
		if (n>2) {
			test(n-1);
		}else{
			System.out.println("n="+n);
		}
		//System.out.println("n="+n);这句话在这的话，程序怎样输出？
	}
	public int factorial(int n){
		if (n==1) {
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}

}