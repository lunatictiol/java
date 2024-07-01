package collectionBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        Integer []arr = {1,2,3,4,5,10,20};
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr));


        System.out.println("list 1" + myList);

        System.out.println("list 2" + list2);

        //collection methods-present in list queue and set
        //remove value
        myList.remove(Integer.valueOf(20));
        //remove index
        myList.remove(1);
        System.out.println("after removing 10 20 from list 1");
        System.out.println(myList);
        //add one collection into others
        myList.addAll(list2);
        System.out.println("adding list 2 to list 1");
        System.out.println(myList);
        //removes intersection
        myList.removeAll(list2);
        System.out.println("removing intersection of list 1 and 2 from 1 ");
        System.out.println(myList);

        //removes everything except intersection
        list2.retainAll(myList);
        System.out.println(list2);

        //list methods
        /*
        get(index) - value at index
        set(index,value) - replace at index
        add(index,value) - add at index
        remove(index) - delete at index
        */


        List<Integer> newList  = new ArrayList<>();
        System.out.println("new list"+newList);

        newList.add(0,2);
        System.out.println("new list add"+newList);
        newList.set(0,1);
        System.out.println("new list set"+newList.get(0));



    }

    static void print(Integer n){

        System.out.println(n);

    }
}
