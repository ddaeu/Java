class Array{
    int []bqpa;
    int count;
	
	Array(){
		bqpa = new int[100];
		count = 0;
	}
	
	void push(int num) {
		bqpa[count] = num;
		count++;
	}
	
	int size() {
		return count;
	}
	int get(int s) {
		return bqpa[s];
	}
	
	
}

public class Main5 {

	public static void main(String[] args) {
		Array arr = new Array();
		
		arr.push(10);
		arr.push(20);
		arr.push(30);
		
		int k = arr.size();
		
		for(int i=0; i<k; i++) {
			System.out.print(arr.get(i)+" ");
		}

	}

}