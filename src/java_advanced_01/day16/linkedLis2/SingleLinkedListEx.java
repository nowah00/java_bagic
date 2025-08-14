package java_advanced_01.day16.linkedLis2;

public class SingleLinkedListEx<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;
        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            while(node != null){
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

        myLinkedList.printAll();
    }
}
