import java.util.Scanner;

public class Main22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = {501, 601, 702, 802, 902, 905};
		String[] name = {"kim", "mun", "park", "lee", "choe", "gang"};
		int[] score= {90, 100, 40, 80, 60, 50};
		
		
		System.out.print("�Է�:");
		int ver = sc.nextInt();
		int len = num.length;
		boolean sw = false;
		int i;
		for(i=0; i<len; i++) {
			if(num[i] == ver) {
				sw =true;
				break;
			}
		}
		if(sw) {
			System.out.println("�̸�:" + name[i]);
			System.out.println("����:" + score[i]);
		}
		else {
			System.out.println("ã�� ���� �����ϴ�");
		}
		

	}

}