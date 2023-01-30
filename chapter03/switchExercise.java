import java.util.Scanner;
public class switchExercise{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊä³öa~d");
		int ch = input.next().charAt(0);
		switch(ch)
		{
			case 'a' :System.out.println('A');break;
			case 'b' :System.out.println('B');break;
			case 'c' :System.out.println('C');break;
			case 'd' :System.out.println('D');break;
			default :System.out.println("other");break;
		}
	}
}