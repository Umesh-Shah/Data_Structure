package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public void sort(int data[], int start, int end) {

		if (start < end) {

			int pivot = partition(data, start, end);
			sort(data, start, pivot - 1);
			sort(data, pivot + 1, end);
		}

	}

	public int partition(int[] data, int start, int end) {

		int pivot = data[end];
		int i = start;

		for (int j = start; j <= end - 1; j++) {
			int temp = 0;
			if (data[j] < pivot) {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		return i;
	}

	public static void main(String[] args) {
		int data[] = {2, 11, 7, 19, 25, 10};

		QuickSort qs = new QuickSort();
		qs.sort(data, 0, data.length - 1);

		System.out.println(Arrays.toString(data));

	}

}
