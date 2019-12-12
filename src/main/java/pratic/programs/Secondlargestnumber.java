package pratic.programs;

public class Secondlargestnumber {

	public static void main(String[] args) {
		int arr[]= new int [] { 20, 30, 50, 4, 71, 100};
		int largest =arr[0];
				int secondlargest =arr[0];	
				
				for (int i=0;i<arr.length;i++)
				{
					if(arr[i]>largest)
					{
						secondlargest=largest;
						largest=arr[i];
					
					}else if(arr[i]<secondlargest)
					{
						secondlargest=arr[i];
					
					}
					
				}
				System.out.println("\nSecond largest number is:" + secondlargest);

	}

}
