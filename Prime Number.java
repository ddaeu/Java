import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("입력:");
		int num = sc.nextInt();
		int s = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0)
				s++;
		}
		 if(s == 2) {
		    	System.out.print("정답:");
		    	System.out.println(num +"은 소수입니다");
		    	return;
		    }
		    else
		    	System.out.println(num + "은 소수가 아닙니다");
			
	}
}