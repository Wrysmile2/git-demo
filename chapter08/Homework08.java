
public class Homework08{ //������
	int count = 9;//����
	public void count1(){//Homework08��ĳ�Ա����
		count = 10;
		System.out.println("count1="+count);
	}
	public void count2(){//Homework08��ĳ�Ա����
		System.out.println("count2="+count++);
	}
	//����Homework08���main�������κ�һ���࣬������main
	public static void main(String[] args) {
		//1.new Homework08() ���������� 
		new Homework08().count1();
		Homework08 h1 = new Homework08();
		h1.count2();
		h1.count2();
	}
}