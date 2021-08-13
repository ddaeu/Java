public class Main27 {

	public static void main(String[] args) {
		int[] data = {4, 5, 6, 7, 9, 2, 4, 6, 5, 10};
		int t, n;
		
		int sw;
		n=data.length;
		for(int i=0; i<n-1; i++) {
			sw = 0;
			for(int j=1; j<n-i; j++) {
				if(data[j-1] > data[j]) {
					t=data[j-1];
					data[j-1]=data[j];
					data[j] = t;
					sw=1;
				}
			}
			if(sw == 0)
				break;
		}
		for(int i=0; i<n; i++)
			System.out.print(data[i] + " ");

	}

}