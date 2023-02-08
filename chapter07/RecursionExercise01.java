import java.util.Scanner;
public class RecursionExercise01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		T t1 = new T();
		System.out.println("请输入要打印的个数：");
		int n = input.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print( t1.fibonacci(i) + "\t" );
			if (i%4==0) {
				System.out.println();
			}
		}
		
	}
}
class T{
	public int fibonacci(int n){

			if (n==1 ||n==2) {
				return 1;
			}else{
				return fibonacci(n-1)+fibonacci(n-2);
			}

		}
		
	}
