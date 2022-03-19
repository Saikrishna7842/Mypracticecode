import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInput_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6,7,8,9};
		
		for(int i=1; i<a.length;i++){
			boolean isprime=true;
		
	    for(int j=2;j<i;j++){
	    	if(i%j==0){
	    		isprime=false;
	    		break;
	    		}
	    	}
	    if(isprime){
	    	System.out.println("prime numbers :"+" "+i);
	    }
	    }
	}
}	
		
		/*int a[]={1,2,3,4,5};
		System.out.println("ODD NUMBERS :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0){
				System.out.println(" "+a[i]);
			}
		}
		System.out.println("EVEN NUMBERS :");
		
		for(int j=0;j<a.length;j++){
			if(a[j]%2==0){
				System.out.println(" "+a[j]);
			}
		}
}
	

}*/
