package collection.linked;
import java.util.LinkedList;
import java.util.List;

public class NewLinkedList <Element>{
    // Here is a class for the task 1 of the Homework.
    private Node <Element> first;
    private Node <Element> last;

    private int size = 0;

    public void add (Element element) {
        // a method for adding
        Node <Element> node;
        if (first == null){
            node = new Node <> (element, null, null);
            first = node;
        } else {
            node = new Node <> (element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }
    // A method which allows to know size.
    public int size (){
        return size;
    }

    private static class Node <Element> {
        Element item;
        Node <Element> next;
        Node <Element> prev;

        public Node (Element item, Node <Element> next, Node <Element> prev){
            //This is a node's constructor.
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
