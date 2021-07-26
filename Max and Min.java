import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¹Ýº¹È½¼ö:");
		int num = sc.nextInt();
		
		print(num);

	}
	
	static void print(int num) {
		Scanner sc = new Scanner(System.in);
		int []s = new int[num];
		
		
		for(int i=0; i<num; i++) {
			System.out.println("¼ö" + (i+1) + ":");
			s[i] = sc.nextInt();
		}
		int maxx = s[0];
		for(int i=0; i<num; i++) {
		    if(s[i] > maxx) maxx = s[i];
		}
		int minn = s[0];
		for(int i=0; i<num; i++) {
			if(s[i] < minn) minn = s[i];
		}
		System.out.println("max =" + maxx);
		System.out.println("min =" + minn);
	}

}