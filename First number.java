public class Main21 {

	public static void main(String[] args) {
		int []arr = {0,0,0,0,0,7,5,0,8,6,0,0};
		int k = arr.length;
		
		int sw=0;
		for(int i=0; i<k; i++) {
			if(arr[i] != 0)
				sw=1;
			
			if(sw==1)
				System.out.print(arr[i] + " ");
		}
		
		
		

	}

}
