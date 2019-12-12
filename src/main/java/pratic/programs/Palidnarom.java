package pratic.programs;

public class Palidnarom {

	public static void main(String[] args) {

		 String str ="rajkumar";
		
		 StringBuffer STR2 = new StringBuffer(str);
		 STR2.reverse();
		 String STR3 = STR2.toString(); 
		 
		 if(STR3.equals(str))
		 {
			 System.out.print("its palindrom :"+STR2);
		 }
		 else 
		 {
			 System.out.print("its not a palindrom :"+STR2); 
		 }
		 
	}

}
