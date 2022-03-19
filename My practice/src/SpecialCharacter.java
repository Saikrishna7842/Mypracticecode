
public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sa= new  StringBuffer("SAIKRISHNA");
		sa.replace(0, 1, "@");
		sa.replace(1, 2, "#");
		sa.replace(2, 3, "$");
		
		System.out.println(sa);

	}

}
