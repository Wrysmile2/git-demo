
public class overload02{
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10,20);
		method.m("Hello,World");
		System.out.println("�������" + method.max(1,2));
		System.out.println("�������" + method.max(1.5,2.5));
		System.out.println("�������" + method.max(1.5,2.5,3.5));
	}
}

class Methods{
	public void m(int n){
		System.out.println("ƽ��="+(n*n));
	}
	public void m(int n1,int n2){
		System.out.println("���="+(n1*n2));
	}
	public void m(String str){
		System.out.println("������ַ���="+ str);
	}

	public int max(int n1,int n2){
		return n1>n2 ? n1 : n2; 
	}
	public double max(double n1,double n2){
		if (n1>n2) {
			return n1;
		}else{
			return n2;
		}
	}
	public double max(double n1,double n2,double n3){
		double max1 = n1 > n2 ? n1 : n2;
		return max1>n3?max1:n3;
	}
}