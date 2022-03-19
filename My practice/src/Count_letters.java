
public class Count_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int []b={1,2,3,4,5,4,4};
		int count=0;
		for(int i=1;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]==b[j]){
					count++;
					
				}
				
			}
			System.out.println(count);
		}
		
		
		
		
		
		/*String a="saikrishna";
		int count=0;
		String[]re=a.split("");
		for(int i=0;i<a.length();i++){
			if(re[i].equalsIgnoreCase("a")){
				count++;
				
				
			}
		}
		
		System.out.println(" "+count);*/
		
	}

}
