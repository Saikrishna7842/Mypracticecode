
public class RevrseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sa="sai santhosh";
		 String rev ="";
		 int length =sa.length();
		 
		 for(int i=length-1;i>=0;i--){
			 rev=rev+sa.charAt(i);
			 }
		
		// System.out.println(rev);
		 String s[]=rev.split(" ");
		 String re=s[0];
		 String re1=s[1];
		 System.out.println(re);
		 System.out.println(re1);
	}
	

}
