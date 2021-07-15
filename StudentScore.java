import java.util.ArrayList;


class Jumsu {
	String name;
	int kor, eng, mat, tot;
	double avg;
	
	Jumsu(String name, int kor, int eng, int mat, int tot, double avg){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = kor + eng + mat;
		this.avg = (kor + eng + mat) / 3.0;
	}

	public String toString() {
		return String.format("%s %d %d %d %d %f", name, kor, eng, mat, tot, avg);
	}
}

public class Main {

	public static void main(String[] args) {
		ArrayList<Jumsu> list = new ArrayList<Jumsu>(); 
		
		list.add(new Jumsu("ȫ�浿", 50, 60, 90, 200, 140));
		list.add(new Jumsu("�̰Ǳ�", 100, 50, 60, 210, 70));
		list.add(new Jumsu("������", 80, 90, 80, 250, 83.33));
		list.add(new Jumsu("����", 80, 90, 80, 250, 83.33));
		list.add(new Jumsu("�ּ���", 70, 90, 80, 240, 80));
		
		int k = list.size();
		
		System.out.println("�̸�" + "  "+ "����"+ "  "+"����"+ "  "+ "����"+ "  "+ "����" + "  "+ "���");
		
		for(int i=0; i<k; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
