public class Main14 {

	public static void main(String[] args) {
		String str = "������1��1�ڵ�";
		
		String s;
		s="";
		
		int k = str.length();
		for(int i=0; i<k; i++) {
			s=s+str.charAt(i);
			if(i < k-1)
				s= s +",";
		}
		System.out.print(s);

	}

}
