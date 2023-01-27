
public class BitOperator02{
	public static void main(String[] args) {
		System.out.println(10%3);
		System.out.println(10%2);
		//a%b当a是小数时，公式 = a-(int)a/b*b;
		//-10.5%3 = -10.5-(-10)/3*3 = -10.5 + 9 = -1.5
		System.out.println(-10.5%3);
	}
}