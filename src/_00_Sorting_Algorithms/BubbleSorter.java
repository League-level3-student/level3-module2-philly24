package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	boolean swapped;
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int j = 0; j < array.length-1; j++) {
			display.updateDisplay();
			for (int i = 0; i < array.length-1; i++) {
				int integer = array[i];
				if (array[i] > array[i+1]) {
					array[i] = array[i + 1];
					array[i+1] = integer;
					
					

				}

			}
		}
	}
	
}

