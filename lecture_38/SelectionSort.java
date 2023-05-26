package lecture_38;

public class SelectionSort {
	
	public static void selectionSort(int arr[])
	{
		
		
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]<arr[min_index]) {
				min_index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr [min_index];
			arr[min_index ]= temp;
		}
		
		
		
	}
	public static void main(String[] args) {
		int arr[] = {7,4,1,2,100,90};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}
}
