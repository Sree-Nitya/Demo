package com.example.demo.polymorphism;

public class Searching {
    public static Contact linearSearch(Contact[] list, Contact target) {
        int index = 0;
        boolean found = false;
        while (!found && index < list.length)
        {
            if (list[index].equals(target))
                found = true;
            else
                index++;
        }
        if (found)
            return list[index];
        else
            return null;
    }

    public static Comparable<Contact> binarySearch(Comparable<Contact>[] list, Comparable<Contact> target) {
        int min = 0, max = list.length - 1, mid = 0;
        boolean found = false;
        while (!found && min <= max)
        {
            mid = (min + max) / 2;
            if (list[mid].equals(target))
                found = true;
            else
            if (target.compareTo((Contact) list[mid]) < 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        if (found)
            return list[mid];
        else
            return null;
    }
}
