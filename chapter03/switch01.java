import java.util.Scanner;
public class switch01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ���a~g��");
		char ch = myScanner.next().charAt(0);
		switch(ch)
		{
			case 'a' :System.out.println("����һ");break;
			case 'b' :System.out.println("���ڶ�");break;
			case 'c' :System.out.println("������");break;
			case 'd' :System.out.println("������");break;
			case 'e' :System.out.println("������");break;
			case 'f' :System.out.println("������");break;
			case 'g' :System.out.println("������");break;
			default :System.out.println("�������");break;
		}
	}
}