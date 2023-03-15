import java.util.ArrayList;      //package to use Array List
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();         //declaration and initialization of Array list

        //add elements

        list.add("Hellloo");
        list.add("!!");                             //simple append elements
        System.out.println(list);

        //get elements

       String element=  list.get(1);            //enter position and find th evalue
       System.out.println(element);
       System.out.println(list);

       //add elements in between

       list.add(1, "Peeppss");     //first value is of index and second to update 
       System.out.println(list);

       //set elements

       list.set(2, "Welcome");     //first value is of index which remove element and update the second value
       System.out.println(list);

       //remove elements

       list.remove(2);
       System.out.println(list);
      
        //size of arraylist

        System.out.println(list.size());

        //loops

        for(int i = 0 ; i<list.size() ; i++){       //print elements one by one
            System.out.println(list.get(i));
        }
        System.out.println();

        //Sorting

        Collections.sort(list);
        System.out.println(list);

    }
}
