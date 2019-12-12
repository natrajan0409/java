package pratic.programs;

import java.util.Stack;

public class MISmatchchar {

	public static void main(String[] args) {
	
		String STR1 ="Tamil";
		String Str2="Tamilarsan";
		String STR4 ;
		
		
		String Str3=STR1.concat(Str2);
			for(int i=1;i<=Str3.length();i++)
		{
			for (int j=10;j<=Str3.length();j++)
			{
				if(Str3.equals(STR4)!=j)
				{
				
					
					System.out.println("mismatch records :"+j);
				}
				
			}
			}
		}
}
