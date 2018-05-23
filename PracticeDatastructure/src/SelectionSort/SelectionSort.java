package SelectionSort;

public class SelectionSort {

	public SelectionSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					temp = array[minIndex];
					array[minIndex] = array[j];
					array[j] = temp;
				}

			}
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}
	}
}
