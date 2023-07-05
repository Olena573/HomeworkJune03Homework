package collection.linked;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class NewLinkedList <Element>{
    // Here is a class for the task 1 of the Homework.
    private Node <Element> first;

    private Node <Element> last;

    private int size = 0;

    public void add (Element element) {
        // a method for adding elements
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

    public void addFirst (Element element){
        //This is the addFirst Method;
        Node newNode = new Node <> (element, null, null);
        newNode.next = first;
        first = newNode;
        size++;
        if (first.next == null){
            last = first;
        }
    }


    // A method which allows to know size.

    public int size (){
        return size;
    }

    public Element get (int index){
        // I did not delete this method.
        Node <Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node.item;
    }


    public Node <Element> getNodeByIndex (int index){
        //I've leaved a simple "get" method and created this one
        Node <Element> node = first;
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            return node;
        }

    public void delete (int index) {
        Node <Element> currentNode = getNodeByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        }else if(index == size-1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }

    public Element getFirst (){
    return get (0);
    }

    public Element getLast (){
        return get (size-1);
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
