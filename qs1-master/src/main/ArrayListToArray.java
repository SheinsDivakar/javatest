package com.kgisl.qs1;
import java.util.*;
/**
 * ArrayListToArray
 */
public class ArrayListToArray {

    public static void main(String[] args) {

		
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("Deeboo");
		arrlist.add("Prabhakar");
		arrlist.add("Sasikumar");
		arrlist.add("GK");

		
		String array[] = new String[arrlist.size()];              
		for(int p =0;p<arrlist.size();p++){
		  array[p] = arrlist.get(p);
		}

	
		for(String q: array)
		{
			System.out.println(q);
		}
	}
}
