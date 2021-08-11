import java.util.ArrayList;
import java.util.Scanner;


class Data {
	int num, score;
	
	Data(int num, int score){
		this.num = num;
		this.score = score;
	}
	public String toString() {
		return num + " " + score;
	}

}

public class Main25 {

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<Data>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("번호:");
			int num = sc.nextInt();
			if(num == -999) break;
			
			boolean sw = false;
			for(int i=0; i<list.size(); i++) {
				Data k = list.get(i);
				if(num == k.num) {
					sw=true;
					break;
				}
			}
			if(sw) {
				System.out.println("이미 존재하는 번호입니다");
				continue;
			}
			System.out.print("점수:");
			int score = sc.nextInt();
			
			list.add(new Data(num, score));
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
