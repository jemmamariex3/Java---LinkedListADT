/**
 * Created by JemmaMarie on 6/14/17.
 */

public class Node {
    Object item;
    Node next;

    Node(Object newItem){
        item = newItem;
        next = null;
    }
    Node(Object newItem, Node nextNode){
        item = newItem;
        next = nextNode;
    }
}
