
public class MethodsDetail02{
	public static void main(String[] args) {
		A a = new A();
		a.sayok(); 
		a.m1();
	}
}

class A{
	//同一个类中的方法可直接调用
	public void print(int n){
		System.out.println("print()方法被调用n="+n);
	}
	public void sayok(){
		print(10);
		System.out.println("继续执行soyok()~~");
	}
	//跨类中的方法调用
	public void m1(){
		//先创建B类对象
		System.out.println("m1()方法被调用");
		B b = new B();
		b.hi();
		System.out.println("m1()继续执行：");
	}
}

class B{
	public void hi(){
		System.out.println("B类中的hi（）被执行");
	}
}