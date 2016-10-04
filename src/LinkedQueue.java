/**
 * Created by lemieszn on 10/4/2016.
 */
public class LinkedQueue<T> implements QueueInterface<T> {
        private Node firstNode; // references node at front of queue
        private Node lastNode; // references node at back of queue
        public LinkedQueue() {
            firstNode = null;
            lastNode = null;
        } // end default constructor

        private class Node
        {
            private T data; // entry in queue
            private Node next; // link to next node

            public void setData (T d) {
                data = d;
            }

            public T getData() {
                return data;
            }

            public void setNextNode (Node n) {
                next = n;
            }

            public T getNextNode() {
                return next;
            }
        } // end Node
    } // end LinkedQueue

}
