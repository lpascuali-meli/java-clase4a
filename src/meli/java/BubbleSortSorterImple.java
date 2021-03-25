package meli.java;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        T temp;
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (c.compare(arr[j + 1], arr[j]) < 0)
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped) { break; }
        }
    }
}
