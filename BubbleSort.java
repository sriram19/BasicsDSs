
public class BubbleSort {
	public  static  void sort(int array[])
	{
		int n = array.length;
		int k;
		for(int m=n;m>0;m--)
		{
			for(int i=0;i<n-1;i++)
			{
				k=i+1;
				if(array[i]>array[k])
				{
					swapNumber(i,k,array);
				}
			}
			printNumbers(array);
		}
	}

	private static void printNumbers(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("the sorted numbers are");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+",");
		}
	System.out.println("\n");	
	}

	private static void swapNumber(int i, int k, int[] array) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i]= array[k];
		array[k]=temp;
		
	}
	public static void main(String[] args)
	{
		//BubbleSort bs= new BubbleSort();
		int[] array= {4,6,1,10,7,2,9};
	    sort(array);	
		
		
	}

}
