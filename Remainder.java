import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		int[] arr= new int[cnt];
		for(int i=0; i<10; i++) {
			System.out.print("ют╥б:");
			int a = sc.nextInt();
			arr[i]=a % 42;
		}
		
		int num = 0;
		for(int i=0; i<10; i++){
			cnt=0;
			for(int k=i+1; k<10; k++) {
				if(arr[i] == arr[k]) {
					cnt++;
				}
			}
			if(cnt == 0)
				num++;
		}
		System.out.println(num);

	}

}
