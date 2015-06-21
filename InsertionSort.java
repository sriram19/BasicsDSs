
public class InsertionSort {

	public static void main(String[] args)
	{
		int[] array = {4,6,1,4,9,3,7,5};
		System.out.println("unsorted array is ");
		display(array);
		int[] arr2 = InsertionSort.doInsertionSort(array);
		System.out.println("unsorted array is");
		display(arr2);
	}

	private static void display(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0;i<array.length;i++)
		{
			System.out.println("the element is s "+array[i]);
		}
	}

	private static int[] doInsertionSort(int[] array) {
		int temp;
		for(int i = 0 ;i <array.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(array[j] < array[j-1])
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}
}
