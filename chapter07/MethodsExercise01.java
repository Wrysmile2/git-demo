//����һ�������ж���ż
import java.util.Scanner;
public class MethodsExercise01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int num = input.nextInt();
		AA a = new AA();
		
		if ( a.parity(num) ) {
			System.out.println(num+"��һ��ż��");
		}else{
			System.out.println(num+"��һ������");
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