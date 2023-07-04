package collection.linked;

public class MainClass {
    //Here is an another class for the 1st task of the homework;
    public static void main (String [] args){
        NewLinkedList <Integer> array = new NewLinkedList <>();

        array.add (4);
        array.add (7);
        array.add (18);
        array.add (32);

        System.out.println(array.size());
    }
}
