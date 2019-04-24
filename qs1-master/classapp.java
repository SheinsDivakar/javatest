package com.kgisl.qs1;

import java.util.*;

class classapp {
    static ArrayList<String> arrlist1 = new ArrayList<String>();
    static ArrayList<String> arrlist2 = new ArrayList<String>();

    static String names1 = "car";

    static String names2 = "bike";

    public static void main(String[] args) {

        create();
        display();
        getName();
        removeif();
        updateName();
        toarray();
      //  toarrayAsType();
        arrayClone();
        arrayContains();
       // clearAll();

    }

    static void create() {

        System.out.println(arrlist1.isEmpty());

        arrlist1.add("xuv");

        arrlist1.add("bolaro");

        arrlist1.add("scorpio");

        arrlist1.add("audi");

        arrlist2.add(names1);
        arrlist2.add(names2);

        arrlist1.addAll(arrlist2);

    }
static void display(){

    System.out.println("The data in arrlist is"+ arrlist1);
}
static void getName(){

    String findName = "audi";

    int findNameindex = arrlist1.indexOf(findName);

    System.out.println("The given string index is :"+ arrlist1.get(findNameindex));
}

static void removeif(){
String findName ="audi";

int findNameindex = arrlist1.indexOf(findName);

arrlist1.remove(findNameindex);

System.out.println("The list  after the element is removed:" +arrlist1);
} 
static void updateName(){

String findName = "xuv";
String updatename = "fiat";
int findNameindex = arrlist1.indexOf(findName);

arr.set(findNameindex,updatename);

System.out.println("The list after update is :"+ arrlist1);
}
static void toarray(){

    System.out.println("The list after converted to array");

    Object[] arr = arrlist1.toArray();

    System.out.println(Arrays.toString(arr) );

}

static void arrayClone(){

System.out.println("clone");

Object.arrayClone = arrlist1.clone();

System.out.println(arrayclone.toString());

} 

static void arrayContains(){

String findname = "bolaro";

System.out.println(arrlist1.contains(findname));

}


}