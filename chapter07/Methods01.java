import java.util.Scanner;
public class Methods01{
	public static void main(String[] args) {
		//方法使用
		Scanner input = new Scanner(System.in);
		Person p1 = new Person();
		p1.Speak();//调用方法
		p1.cal01();
		System.out.println("请输入一个数：");
		int n = input.nextInt();
		p1.cal02(n);
		int sum = p1.getSum(10,20);
		System.out.println("getSum方法返回的值="+sum);

	}
}

class Person{
	String name;
	int age;
	public void Speak(){
		System.out.println("我是一个好人");
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
		System.out.println("cal02方法计算的值=" + sum);
	}
	public int getSum(int num1,int num2){
		int sum = num1+num2;
		return sum;
	}
}