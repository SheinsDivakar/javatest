package com.kgisl.qs1;

import java.util.*;

/**
 * Employe
 */
public class Employe {

    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add(new employe(101, "Vijay", 23000));
        al.add(new employe(102, "Deeboo", 25000));
        al.add(new employe(103, "Prabha", 27000));
        System.out.println("Sorting By ID");

        Collections.sort(a1).new Namecomprator();
        Iterator itr = al.iterator();
        while (itr.hasNext());
            Employee emp = (Employee) itr.next();
            System.out.println(emp.id + " " + emp.name + " " + emp.salary);

            System.out.println("Sorting By Name");
            Collections.sort(a2).new Namecomprator();
            Iterator itra = a2.iterator();
            while (itra.hasNext());
            System.out.println(emp.id + " " + emp.name + " " + emp.salary);

            System.out.println("Sorting By Salary");
            Collections.sort(a2).new Namecomprator();
            Iterator tra = a2.iterator();
            while (tra.hasNext()) ;
            System.out.println(emp.id + " " + emp.name + " " + emp.salary);
        }
    }
