import java.util.Scanner;
public class Methods01{
	public static void main(String[] args) {
		//����ʹ��
		Scanner input = new Scanner(System.in);
		Person p1 = new Person();
		p1.Speak();//���÷���
		p1.cal01();
		System.out.println("������һ������");
		int n = input.nextInt();
		p1.cal02(n);
		int sum = p1.getSum(10,20);
		System.out.println("getSum�������ص�ֵ="+sum);

	}
}

class Person{
	String name;
	int age;
	public void Speak(){
		System.out.println("����һ������");
	}
	public void cal01(){
		int sum = 0;
		for (int i=0;i<=100 ;i++ ) {
			sum += i;
		}
		System.out.println("1+2+3+....+100=" + sum);
	}
	public void cal02(int n){
		int sum = 0;
		for (int i=0;i<=n ;i++ ) {
			sum += i;
		}
		System.out.println("cal02���������ֵ=" + sum);
	}
	public int getSum(int num1,int num2){
		int sum = num1+num2;
		return sum;
	}
}