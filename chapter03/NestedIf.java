import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		System.out.println("���������ĳɼ���\n");
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();
		if (score>8.0) {
			System.out.println("�������Ա�");
			char genter = myScanner.next().charAt(0);
			if (genter == '��') {
				System.out.println("����������");
			}else if (genter == 'Ů') {
				System.out.println("����Ů����");
			}else{
				System.out.println("���Ա����󣬲��ܲμӾ���");
			}

		}
		else
		{
			System.out.println("sorry���㱻��̭��~");
		}

	}
} 