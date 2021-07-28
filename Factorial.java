import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		int num = sc.nextInt();
		int s=1;
		
		/*for(int i=num; i>=1; i--) {
			s = s * i;
		}*/
		for(int i=1; i<=num; i++) {
			s = s*i;
		}
		System.out.println("정답:" + s);
		
		

	}

}
