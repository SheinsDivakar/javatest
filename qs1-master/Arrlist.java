package com.kgisl.qs1;


import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class ArrList {

    public static void main(String[] args) {
        // Instantiate an Array
        String s[] = new String[] { "a", "b", "c", "d" };
        // Creating an Arraylist
        ArrayList<String> Alist1 = new ArrayList<String>();
        // Adding elements into list
        Alist1.add("Hi");
        Alist1.add("hello");
        Alist1.add("GK");
        Alist1.add("Hit");
        Alist1.add(2, "element");
        Alist1.add("1001");
        Alist1.add("ok");
        // Printing ArrayList
        System.out.println(Alist1);
        // creating an ArrayList2
        ArrayList<String> Alist2 = new ArrayList<String>(Arrays.asList(s));
        System.out.println(ArrayUtils.toString(Alist2));
        // Create an array
        // coverting List as Array u[]
        String[] u = new String[Alist2.size()];
        Alist2.toArray(u);
        System.out.println(ArrayUtils.toString(u));
        // Adding elements in Alist2
        Alist2.add("Hello");
        Alist2.add(4, "inserted");
        Alist1.remove("Hit");
        Alist1.remove(2);
        Alist1.set(1, "HELLO");
        // Printng Alist1 using for each
        for (String v : Alist1) {
            System.out.print(v + " ");
        }
        System.out.println();
        // Printng Alist2 using for each
        for (String var : Alist2) {
            System.out.print(var + " ");
        }
        System.out.println();
        System.out.println("Index of the object is=" + Alist1.indexOf("GK"));//To find index
        System.out.println(Alist2.get(5));                                   //To get element
        System.out.println(Alist1.size());                                   //To get size
        System.out.println(Alist2.contains("inserted"));                     //To check whether the element is present in the list or not
        Alist2.clear();                                                     //To clear our list
        System.out.println(Alist2);

    }
}