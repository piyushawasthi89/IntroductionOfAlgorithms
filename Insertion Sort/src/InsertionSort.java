/*
 * This is a very small program so I will just create a static method
 * for sorting and will call it from main
 */
public class InsertionSort 
{

	public static void main(String[] args) 
	{
		int[] numbers = {3,2,4,-1,0,8,4};
		sort(numbers);
	}
	
	public static void sort(int[] numbers)
	{
		for(int i=1;i<numbers.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(numbers[j-1]<=numbers[j])
				{
					break;
				}
				
				int temp = numbers[j-1];
				numbers[j-1] = numbers[j];
				numbers[j] = temp;
			}
		}
	}

}
