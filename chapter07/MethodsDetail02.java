
public class MethodsDetail02{
	public static void main(String[] args) {
		A a = new A();
		a.sayok(); 
		a.m1();
	}
}

class A{
	//ͬһ�����еķ�����ֱ�ӵ���
	public void print(int n){
		System.out.println("print()����������n="+n);
	}
	public void sayok(){
		print(10);
		System.out.println("����ִ��soyok()~~");
	}
	//�����еķ�������
	public void m1(){
		//�ȴ���B�����
		System.out.println("m1()����������");
		B b = new B();
		b.hi();
		System.out.println("m1()����ִ�У�");
	}
}

class B{
	public void hi(){
		System.out.println("B���е�hi������ִ��");
	}
}