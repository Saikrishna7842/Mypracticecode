import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,2,3,4};
		int[] b ={8,5,7,0};
		
		int a1=a.length;
		int b1 =b.length;
		int c1=a1 + b1;
		
		
		int c[]  = new int[c1]; 
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		System.out.println(Arrays.toString(c));
		
				
		
	}

}
