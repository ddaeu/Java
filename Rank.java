public class Main26 {

	public static void main(String[] args) {
		int[] num = {100, 200, 300, 400, 500, 600};
		int[] score = {80,90,70,100,90,60};
		int r;
		
		System.out.println("num score rank");
		for(int i=0; i<6; i++) {
			r=1;
			for(int j=0; j<6; j++) {
				if(score[i] < score[j]) {
					r++;
				}
			}
			System.out.println(num[i] + " " + score[i] + " " + r);
		}

	}

}
