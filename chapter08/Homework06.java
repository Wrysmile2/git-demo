import java.util.Scanner;
public class Homework06{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个数：");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		Cale c1 = new Cale(n1,n2);
		System.out.println("两数之和="+c1.plus());
		System.out.println("两数之差="+c1.minus());
		System.out.println("两数之乘="+c1.times());
		System.out.println("两数之除="+c1.division());
	}
}
class Cale{
	double n1;
	double n2;
	public Cale(double n1,double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public double plus(){
		return n1+n2;
	}
	public double minus(){
		return n1-n2;
	}
	public double times(){
		return n1*n2;
	}
	public double division(){
		return n1/n2;
	}
}