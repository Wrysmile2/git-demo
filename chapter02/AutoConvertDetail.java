
public class AutoConvertDetail{
	public static void main(String[] args) {
		//�ж������͵����ݻ������ʱ
		//ϵͳ�����Զ�����������ת�������������������ͣ�Ȼ���ڽ��м���
		int n1 = 10;
		double d1 = n1 + 1.1;//���󣬽����double����
		float d2 = n1 + 1.1F;
		System.out.println(d1 + "\n" + d2);

		//�����ǰѾ���(����)����������͸�ֵ������С����������ʱ��
		//�ͻᱨ����֮�ͻ�����Զ�����ת����
		// int n2 = 1.1; //�ᱨ�� double -> int 
		
		//byte,short,char ֮�䲻���Զ�ת��
		//������ֵbyteʱ�����жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		byte b1 = 10; //�ԣ�-128~127
		int n2 = 1;
		byte b2 = n2;//?
	}
}