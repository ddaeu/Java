public class Main17 {

	public static void main(String[] args) {
		int []arr = {2,3,5,6,2,8,9,10,11,12};
		int []odd = new int[10];
		int []even = new int[10];
		
		int oddCnt = 0;
		int evenCnt = 0;
		int i;
		
	    int k=arr.length;
	    for(i=0; i<k; i++) {
	    	if(arr[i] % 2 ==0) {
	    		even[evenCnt]=arr[i];
	    		evenCnt++;
	    	}
	    	if(arr[i] % 2 == 1) {
	    		odd[oddCnt] =arr[i];
	    		oddCnt++;
	    	}
	    }
	    
	    System.out.println("Â¦¼ö:");
	    for(i=0; i<evenCnt; i++)
	    	System.out.print(even[i] + " ");
	    
	    System.out.println("\nÈ¦¼ö");
	    for(i=0; i<oddCnt; i++)
	    	System.out.print(odd[i] + " ");
	}

}
