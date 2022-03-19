
public class String1 {

	public static void main(String[] args) {
		
		
		
		
		int s=2547;
	   int b=0;
	   while(s!=0){
		   
		   b=b*10+s%10;
		   s=s/10;
		   
	   }
		System.out.println(b);
		String sa="saikrishna";
		String rev="";
		int len=sa.length();
		for(int i=len-1;i>=0;i--){
			
			rev=rev+sa.charAt(i);
		}
       System.out.println(rev);
	}
	
}
