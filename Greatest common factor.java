public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int small;
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int s=1;
		
		for(int i=1; i<=small; i++ ) {
			if(big % i == 0 && small % i ==0)
				s=i;
		}
		System.out.println(s);
	}

}
