
public class Homework02{
	public static void main(String[] args) {
		HW02 h1 = new HW02();
		String[] strs = {"java","c","c++","php","Python"};
		int index = h1.find("php",strs);
		System.out.println("²éÕÒµÄindex=" + index);
	}
}

class HW02{
	public int find(String findStr,String[] strs){

		for (int i=0;i<strs.length;i++) {
			if (findStr.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
}