
public class VarParameterDetail{
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		T t1 = new T();
		t1.length(arr);
	}
}
class T{
	//ϸ�ڣ��ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
	//һ���β��б���ֻ����һ���ɱ����
	public void length(int... nums){
		System.out.println("����="+nums.length);
	}
}