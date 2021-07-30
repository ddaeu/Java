import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[9];
		for(int i=0; i<9; i++) {
			System.out.print("ют╥б:");
			int num = sc.nextInt();
			arr[i] = num;
			
		}
		int cnt = 0;
		int index = 0;
		int maxx = arr[0];
		for(int i=0; i<9; i++) 
		{
			cnt++;
			if(arr[i] > maxx) {
				maxx= arr[i];
				index = cnt;
			}
	
		}
		
		System.out.print(maxx + "\n" + index);

	}

}
