//��ӡ�������еķ���
import java.util.Scanner;
public class MethodsExercise02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ��ӡ��������");
		int row = input.nextInt();
		System.out.print("������Ҫ��ӡ��������");
		int col = input.nextInt();
		System.out.print("������Ҫ��ӡ���ַ���");
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