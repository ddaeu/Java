import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("ÀÔ·Â:");
	    int num = sc.nextInt();
	
		int sum = 0;
		int s = 0;
		
		while(num > 0) {
			s = num % 10;
			num = num / 10;
			sum += s;
		}
		System.out.println(sum);

	}

}
