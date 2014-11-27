/** 
 * Class definition for a QNode of a singly linked list of doubles. 
 */
public class QNode {

        /* Note: these fields are public so that they can be directly accessed
         * from outside this class.  For example, if v is a Node object, 
         * then v.entry and v.next can be used to access these fields. */
         
        public double entry;    //the price entry 
        public QNode next;               //refers to the next node in the list
        
        /** 
         * Constructor: creates a node with the given entry and next Node. 
         */
        public QNode(double e, QNode n) {
                entry = e;
                next = n;
        }
}
