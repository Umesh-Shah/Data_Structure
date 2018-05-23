package SortingAlgorithms;

public class ShellSort {

	public ShellSort(int data[]) {

		sort(data, data.length - 1);

	}

	public void sort(int[] data, int h) {

		int interval = (h + 1) / 3;

		for (int i = 0; i < h;) {

			i = i + interval;
		}

	}

}
