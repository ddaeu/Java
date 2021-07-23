import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int maxx = a;
		
		if(b > maxx) maxx = b;
		if(c > maxx) maxx = c;
		if(d > maxx) maxx = d;
		
		int minn= b;
		
		if(a < minn) minn = a;
		if(c < minn) minn = c;
		if(d < minn) minn = d;
		
		int result = maxx - minn;
		
		System.out.println(result);

	}

}