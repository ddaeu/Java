public class Main3 {
	public static void main(String[] args) {
		
		String input = "helloWorlD";
		
		char []arr;
		arr = input.toCharArray();
		
		System.out.print(arr);
		System.out.println();
		
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + 32); 
			}
			
			else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - 32);
			}		
		}
		
		System.out.print(arr);
	}
}
