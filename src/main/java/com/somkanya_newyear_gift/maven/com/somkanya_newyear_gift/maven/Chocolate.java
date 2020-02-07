package com.somkanya_newyear_gift.maven.com.somkanya_newyear_gift.maven;

import java.util.*;
//import java.lang.*;
//import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Chocolate extends Gift 
{
	 HashMap<String, Integer> chocop  = new HashMap();
   HashMap<String, Integer> chocow  = new HashMap();
   Scanner input = new Scanner(System.in);
   void get()
   {
       System.out.println("Enter number of chocolates, weight and price:");
       int n = Integer.parseInt(input.nextLine());
       for(int i=0;i<n;i++)
       {
           String s[] = input.nextLine().split(" ");
           chocop.put(s[0],Integer.parseInt(s[2]));
           chocow.put(s[0],Integer.parseInt(s[1]));
       }
       
   }
   
       HashMap<String, Integer> outp  = new HashMap();
       HashMap<String, Integer> outw  = new HashMap();
       Map<String, Integer> sortedMap = new HashMap<String, Integer>();

   void sort()
   {
       System.out.println("Enter Lower weight and Higher price bounds:");
       String s[]=input.nextLine().split(" ");
       int low=Integer.parseInt(s[0]), high = Integer.parseInt(s[1]);
       
       for(String key : chocop.keySet())
       {
           if(chocop.get(key)<=high && chocow.get(key)>=low )
           {
//               System.out.println(key+" "+chocop.get(key)+" "+chocow.get(key));
               outp.put(key,chocop.get(key));
               //outw.put(key,chocow.get(key));
           }
       }
       List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(outp.entrySet());

   // Sorting the list based on values
       Collections.sort(list, new Comparator<Entry<String, Integer>>()
       {
           public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2)
           {
               return o1.getValue().compareTo(o2.getValue());
           }
       });

       // Maintaining insertion order with the help of LinkedList
       for (Entry<String, Integer> entry : list)
       {
           sortedMap.put(entry.getKey(), entry.getValue());
           System.out.println(entry.getKey() + " "+entry.getValue());
       }
   
   }

   void sortw()
   {
       System.out.println("Enter Lower weight and Higher price bounds:");
       String s[]=input.nextLine().split(" ");
       int low=Integer.parseInt(s[0]), high = Integer.parseInt(s[1]);
       
       for(String key : chocop.keySet())
       {
           if(chocop.get(key)<=high && chocow.get(key)>=low )
           {
//               System.out.println(key+" "+chocop.get(key)+" "+chocow.get(key));
               //outp.put(key,chocop.get(key));
               outw.put(key,chocow.get(key));
           }
       }
       List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(outw.entrySet());

   // Sorting the list based on values
       Collections.sort(list, new Comparator<Entry<String, Integer>>()
       {
           public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2)
           {
               return o1.getValue().compareTo(o2.getValue());
           }
       });

       // Maintaining insertion order with the help of LinkedList
       for (Entry<String, Integer> entry : list)
       {
           sortedMap.put(entry.getKey(), entry.getValue());
           System.out.println(entry.getKey() + " "+outw.get(entry.getKey()));
       }
   
   }
}

