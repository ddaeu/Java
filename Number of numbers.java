public class Main13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�:");
		int A = sc.nextInt();
		
		System.out.print("�Է�:");
		int B = sc.nextInt();
		
		System.out.print("�Է�:");
		int C = sc.nextInt();
		int result = A * B * C; 
		
		String str = Integer.toString(result); 
		
		for(int i=0; i<10; i++) { 
			int cnt = 0;
			for(int j=0; j<str.length(); j++) { 
				if((str.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}