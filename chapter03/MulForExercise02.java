
public class MulForExercise02{
	public static void main(String[] args) {
		int i,j;
		for (i=1;i<10;i++) {
			for (j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"=" + i*j);
				System.out.print(" ");
			}
			System.out.println('\n');
		}
	}
}