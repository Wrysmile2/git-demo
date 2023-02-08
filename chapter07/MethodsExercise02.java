//打印四行四列的符号
import java.util.Scanner;
public class MethodsExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要打印的行数：");
		int row = input.nextInt();
		System.out.print("请输入要打印的列数：");
		int col = input.nextInt();
		System.out.print("请输入要打印的字符：");
		char c = input.next().charAt(0);
		AA a = new AA();
		a.print(row,col,c);
	}
}

class AA{
	public void print(int row,int col,char c){
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}