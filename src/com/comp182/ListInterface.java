/**
 * Created by JemmaMarie on 6/14/17.
 */

public interface ListInterface {
//*********************************************************
//      Interface for the ADT list
//*********************************************************

        //list operations:
        public boolean isEmpty();
        public int size();
        public void add (int index, Object item);
        public Object get(int index);
        public void remove(int index);
        public void removeAll();
    }

