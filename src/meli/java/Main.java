package meli.java;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
	// write your code here
        // Creamos arreglos
        Integer[] arr1 = new Integer[20];
        Integer[] arr2 = new Integer[20];
        Integer[] arr3 = new Integer[20];
        Integer[] arr4 = new Integer[20];

        // Cargamos valores aleatorios
        for (int x=0; x < arr1.length; x++) {
            arr1[x] = (int) (Math.random()*20)+1;
            arr2[x] = (int) (Math.random()*20)+1;
            arr3[x] = (int) (Math.random()*20)+1;
            arr4[x] = (int) (Math.random()*20)+1;
        }

        BubbleSortSorterImple s1 = new BubbleSortSorterImple();
        HeapSortSorterImple s2 = new HeapSortSorterImple();
        QuickSortSorterImple s3 = new QuickSortSorterImple();

        Comparator<Integer> c1 = Integer::compareTo;

        System.out.println("BUBBLE SORT");
        System.out.println(Arrays.toString(arr1));
        s1.sort(arr1, c1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("HEAP SORT");
        System.out.println(Arrays.toString(arr2));
        s2.sort(arr2, c1);
        System.out.println(Arrays.toString(arr2));

        System.out.println("QUICK SORT");
        System.out.println(Arrays.toString(arr3));
        s3.sort(arr3, c1);
        System.out.println(Arrays.toString(arr3));

        // PUNTO 8
        Sorter s4 = (Sorter) MiFactory.getInstance("");
        System.out.println(Arrays.toString(arr4));
        s4.sort(arr4, c1);
        System.out.println(Arrays.toString(arr4));


    }
}
