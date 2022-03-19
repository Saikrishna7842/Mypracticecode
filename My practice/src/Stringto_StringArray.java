
public class Stringto_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Sai krishna mk";
		
		String strArray[]=str.split(" ");
		System.out.println(strArray);
		
		System.out.println("String :"+ str);
		System.out.print("String array: [");
		
		for(int i=0;i<strArray.length;i++){
			System.out.print(strArray[i]+",");
		}
		System.out.print("]");
	}

}
