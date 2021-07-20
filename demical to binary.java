public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

        int []a = new int[100];
		int count = 0;
		
		
		while(num > 0 ) {
			a[count] = num % 2;
			num /= 2;
			count++;
		}
		count--;
		
		for(; count>=0; count--) {
			System.out.print(a[count]);
		}
	}
}




public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		
		int []a = new int[100];
		int []b = new int[100];
		
		int sum = num;
		for(int i=0; sum>0 ; i++) {
			a[i] = sum/ 2;
			b[i] = sum % 2;
			sum = sum/ 2;
			count++;
		}
		
		for(int i=count-1; i>=0; i--) {
			System.out.print(b[i]);
		}
    }
}
		
		
			
		
		
		

