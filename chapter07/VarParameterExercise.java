
public class VarParameterExercise{
	public static void main(String[] args) {
		HsMethods hm = new HsMethods();
		System.out.println(hm.showScore("jack",85.5,96.4,78.6));
	}
}
class HsMethods{
	public String showScore(String name,double... score){
		double totalScore = 0;
		for (int i=0;i<score.length;i++) {
			totalScore += score[i];
		}
		return name + "��" + score.length + "�ſε��ܳɼ�Ϊ=" + totalScore;
	}
}