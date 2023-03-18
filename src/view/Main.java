package view;

import br.edu.fateczl.quicksort.QuickSort;

public class Main {
	public static void main(String[] args) {
		int vetor[] =  {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		QuickSort order = new QuickSort();
		
		vetor = order.quickSort(vetor, 0, vetor.length - 1);
		
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
