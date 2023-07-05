package collection.linked;
import java.util.LinkedList;
import java.util.LinkedList;


public class MainClass {
    //Here is another class for the 1st task of the homework;
    public static void main (String [] args){
        NewLinkedList <Integer> array = new NewLinkedList <>();

        array.add (4);
        array.add (7);
        array.add (18);
        array.add (32);

        System.out.println(array.size());

        //Here a "get" method can be tested:
        System.out.println (array.get(1));
        System.out.println (array.get(2));
        System.out.println (array.get(0));
        System.out.println (array.get(3));

        //here a "delete" method is tested:
        array.delete(2);

        for (int i = 0; i <array.size(); i++){
            System.out.println(array.get(i));
        }
        //Here is a usage of the getGirst () method:
        System.out.println("Here is a first element: " + array.getFirst());

        //Here is a usage of the getLast () method:
        System.out.println("Here is a last element: " + array.getLast());

        //Here is a usage of the addFirst () method:
      array.addFirst (45);

        for (int i = 0; i <array.size(); i++){
            System.out.println("Here is a test of the addFirst method: "+ array.get(i));
        }

        //  array.addFirst(12);

    }
}
