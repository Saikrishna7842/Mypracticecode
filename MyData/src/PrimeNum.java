import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,1,2,3,4,5};

		for (int i = 0; i < array.length - 1; i++) {
		    int count = 1;
		    for (int j = i + 1; j < array.length; j++) {
		        if (array[i] == array[j]) {
		            count++;
		        }
		    }
		    if (count > 1) {
		        System.out.println(array[i] + "\toccurs\t" + count + " times");
		    }
		}		
		
		
		
		
		
		
		  //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
         
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) 
                   
                    System.out.println(arr[j]);  
            }  
        }  
    
		
		
		
		
	 int a[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
		
		
		for(int i=1;i<=a.length;i++)
		{
			boolean isprime =true;
			
			for(int j=2;j<i;j++){
				if(i%j == 0){
					isprime=false;
					break;
				}
			}
			if(isprime){
				System.out.println("PRIME NUMBERS: "+ "" +i);
				//System.out.println(i);
			}
		}
		
		
		/*int arr[] ={1,2,3,4,5,6,7};
		int r=0;
		for(int k=0; k<arr.length; k++){
			r+=arr[k];*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		//System.out.println(r);
	}


