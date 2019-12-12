package pratic.programs;

public class testpalindrom {

	public static void main(String[] args) {
		String STR="Madam";
		
		///char[] ch=STR.toCharArray(); 	
	
      for(int i=STR.length();i>0; i--);
      
     String STR2= STR.toString();
     if(STR2.equals(STR2)) 
    	 {
			 System.out.print("its palindrom :"+STR2);
		 }
		 else 
		 {
			 System.out.print("its not a palindrom :"+STR2); 
		 }
     }
    	  
  
}
