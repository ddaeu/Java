import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("�Է�:");
		int num = sc.nextInt();
		int s = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0)
				s++;
		}
		 if(s == 2) {
		    	System.out.print("����:");
		    	System.out.println(num +"�� �Ҽ��Դϴ�");
		    	return;
		    }
		    else
		    	System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
			
	}
}