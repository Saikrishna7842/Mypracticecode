
public class Abstract {

	
	public static void main  (String[] args){
		
		System.out.println("HELLO JAVA");
		
		int c=10; 
		int d=20;
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println("afterswaping"+c+" "+d);
		
		 c=c^d;
		 d=c^d;
		 c=c^d;
		 System.out.println("afterswaping"+c+" "+d); 
		
		int a=12345;
		int b=0;
		while(a!=0){
			b=b*10+a%10;
			a=a/10;
		}
		System.out.println(b);
	}

		
		
		
	
}
