import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tot,num;

		tot = 0;
		for(int i=1; i<=100; i++) {
			System.out.println("num");
			num = sc.nextInt();
			if(num == -9999) break;
			tot += num;
		}
		
		System.out.println("Total=" + tot);
	}

}