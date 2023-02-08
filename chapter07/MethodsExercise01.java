//输入一个数，判断奇偶
import java.util.Scanner;
public class MethodsExercise01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		AA a = new AA();
		
		if ( a.parity(num) ) {
			System.out.println(num+"是一个偶数");
		}else{
			System.out.println(num+"是一个奇数");
		}
	}
}
class AA{
	public boolean parity(int num){
		if (num%2 == 0) {
			return true;
		}else{
			return false;
		}
		//return num%2 == 0? true:false;
	}
}