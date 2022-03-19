
public class Mypractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10,b=25;
		
		int t=a;
		    a=b;
		    b=t;
		    
		    
		    
		    
		    System.out.println(""+a+""+b);
		    
		    
		    int k=10,g=15;
		    
		    k=k*g;
		    g=k/g;
		    k=k/g;
		    System.out.println(""+k+""+g);
		
		    int h=25,m=30;
		    h=h+m;
		    m=h-m;
		    h=h-m;
		    
		    System.out.println(""+h+""+m);
		
		
		
		/*int a=2435;
		int b=0;
		while(a!=0){
			b=b*10+a%10;
			a=a/10;
			
		}
		System.out.println(b);*/
		
		StringBuffer sam= new StringBuffer("krishna");
		sam.reverse();
		System.out.println(sam);
		String str = "saikrishna";
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
        System.out.println(rev);
        
	}
	
	
	
	
	
	
	

}
