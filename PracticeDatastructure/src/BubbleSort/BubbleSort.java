package BubbleSort;

public class BubbleSort {

	public BubbleSort(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < (array.length - 1) - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
