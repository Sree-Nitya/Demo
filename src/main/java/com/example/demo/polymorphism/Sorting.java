package com.example.demo.polymorphism;

public class Sorting {

    public void selectionSort(Comparable<Contact> [] list){
        int min;
        Comparable<Contact> temp;
        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo((Contact)list[min]) < 0)
                    min = scan;

            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public void insertionSort(Comparable<Contact>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<Contact> key = list[index];
            int position = index;
            //  Shift larger values to the right
            while (position > 0 && key.compareTo((Contact)list[position-1]) < 0)
            {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}
