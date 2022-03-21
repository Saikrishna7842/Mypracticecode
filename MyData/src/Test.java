
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//long a =123456;
		
		
		//System.out.println(new StringBuilder(String.valueOf(a)).reverse());
		//System.out.println(new StringBuffer(String.valueOf(a)).reverse());
		
		
		int l=30,m=40;
		int t=m;
		    m=l;
		    l=t;
		    
		    System.out.println(""+l+" "+m);
		
		
		
		int a=20, b=300;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(""+a+" "+b);
				
		
		
		//Reverse the String
		
		String st = "SAI";
		String rev ="";
		
		int len=st.length();
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		 System.out.println(rev);
		 
		 StringBuffer stk = new StringBuffer("krishna");
		 stk.reverse();
		 System.out.println(stk);
		 
		 String kk= "ABCD";
		 String revs="";
		 char d[]=kk.toCharArray();
		 int lens =d.length;
		 for(int j=lens-1;j>=0;j--)
		 {
			 revs=revs+d[j];
			 
		 }
		 
		 
		 System.out.println(revs);
		 
		 
		 
		 int j[] = {1,2,3,4,5,6,7,8,10,11,12,15,16};
		 System.out.print("EVEN NUMBERS :");
		 for(int k=0;k<j.length;k++)
		 
		 {
			 if(j[k]%2==0)
				 System.out.print(" "+j[k]);
		 } 
		 System.out.println("");
		 System.out.print("odd numbers :");
		 for(int k=0;k<j.length;k++)
		 {
			 if(j[k]%2!=0)
				
				 System.out.print(" "+j[k]);
			 
		 }
		 
		
		 
	
			 
			 
		 }
		 
		 
		
	

}
