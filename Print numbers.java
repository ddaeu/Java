public class Main18 {

	public static void main(String[] args) {
		int []be =  {2,3,5,6,7,8,9,10,12,13,15};
		int i, t;
		
		int len = be.length;
		for(i=0; i<len/2; i++) {
			t=be[i];
			be[i] = be[len-i-1];
			be[len-i-1]=t;
		}
		for(i=0; i<len; i++) {
			System.out.print(be[i]+ " ");
		}
		

	}

}