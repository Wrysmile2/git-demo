import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ��
public class Input{
	//��дһ��main����
	public static void main(String[] args) {
		//Scanner�� ��ʾ ���ı�ɨ��������java.util��
		//1.����Scanner�����ڵİ�
		//2.����Scanner����new����һ������
		Scanner myScanner = new Scanner(System.in);
		//3.�����û�������
		System.out.println("����������");
		String name = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("������нˮ");
		double wages = myScanner.nextDouble();
		System.out.println("�˵���Ϣ����");
		System.out.println("����=" + name + 
			"����=" + age + "нˮ=" + wages);
	}
}