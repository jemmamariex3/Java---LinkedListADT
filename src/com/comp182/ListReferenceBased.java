/**
 * Created by JemmaMarie on 6/14/17.
 */


//*********************************************************
//      Reference-based implementation of ADT list
//*********************************************************

    public class ListReferenceBased implements ListInterface{
        //reference to linked list of items
        private Node head;
        private int numItems;

        public ListReferenceBased(){
            numItems = 0;
            head = null;
        }
        public boolean isEmpty(){
            return numItems == 0;
        }
        public int size(){
            return numItems;
        }
        private Node find(int index){
//*********************************************************
//Locates a specific node in a linked list
//Precondition: index is the number of the desired
//node. Assumes that 1 <= index <= numItems+1
//Postcondition: Returns a reference to the desired node
//*********************************************************

            Node curr = head;
            for(int skip = 0; skip < index; skip++){
                curr = curr.next;
            }
            return curr;
        }

    public Object get(int index) throws ListIndexOutOfBoundsException {
        if (index >=0 && index < numItems) {
            //get reference to node, then data in node
            Node curr = find(index);
            Object dataItem = curr.item;
            return dataItem;
        }
        else {
            throw new ListIndexOutOfBoundsException ("List index out of bounds on get");
        } // end if
    } // end get




        public void add(int index, Object item){
            if(index >= 0 && index < numItems+1){
                if(index == 0){
                    Node newNode = new Node(item,head);
                    head = newNode;
                }
                else{
                    Node prev = find(index-1);
                    Node newNode = new Node(item, prev.next);
                    prev.next = newNode;
                }
                numItems++;
            }
        }
        public void remove(int index){
            if(index >= 0 && index <numItems){
                if(index == 0){
                    head = head.next;
                }
                else{
                    Node prev = find(index-1);
                    Node curr = prev.next;
                    prev.next = curr.next;
                }
                numItems--;
            }
        }
        public void removeAll(){
            head = null;
            numItems = 0;
        }
    }
