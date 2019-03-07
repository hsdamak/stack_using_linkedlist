package main;

public class Stack {
    private static class Node {
        private int data;
        private Node nextNode;


        public int getData() {
            return data;
        }


        public Node getNextNode() {
            return nextNode;
        }



        public void setData(int data) {
            this.data = data;
        }


        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }


        public Node(int data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }

    private Node head = null;

    private int size = 0;

    public void push(int data){
        Node newNode = new Node(data,)
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");

        //  create a copy for the current 'head' node for the list
        Node temp = this.head;

        //  travers the current linked list
        while (temp != null) {

            //  append the data of the current node to the result
            result.append(temp.getData());

            // check if the current node has a next node
            if (temp.getNextNode() != null) {
                //  append an arrow to depict the single reference between two nodes
                result.append(" --> ");
            }

            //  update the reference of temp to the next node
            temp = temp.getNextNode();
        }

        //  append a ] for the end of the list
        result.append("]");
        return result.toString();

    }
}
