 

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		
		
		
		// reverse integer
		int a=8756;
		
		int b=0;
		while(a!=0){
			b=b*10+a%10;
			a=a/10;
		}
		System.out.println(b);
		StringBuffer sai = new StringBuffer("4321");
		sai.reverse();
		System.out.println(sai);
		// reverse String
		String ka ="1234";
		String rev ="";
		int len =ka.length();
		for (int i = len-1; i >=0; i--) {
			rev=rev+ka.charAt(i);
			
		}
		System.out.println(rev);

		
		
	}

}
