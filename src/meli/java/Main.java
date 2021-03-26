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



        // PUNTO 10
        // Primero creamos array
        Integer[] arr5 = new Integer[10000];
        for (int x=0; x < arr5.length; x++) {
            arr5[x] = (int) (Math.random()*1000)+1;
        }

        // Creamos el objeto para ordenar
        Sorter s5 = (Sorter) MiFactory.getInstance("");
        // Creamos el objeto para contar el tiempo
        Time time = new Time();
        System.out.println(Arrays.toString(arr5));
        System.out.println("INICIO con algoritmo " + s5.getClass());
        time.start();
        s5.sort(arr5, c1);
        time.stop();
        System.out.println("FINAL");
        System.out.println("Tiempo de ejecución: " + time.elapsedTime() + " milisegundos.");
        System.out.println(Arrays.toString(arr5));

    }
}
