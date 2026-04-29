package coding.dataStructures.linkedListU5.findMiddleNode;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(2);

        ll.append(4);
        ll.append(6);
        ll.append(3);
        ll.append(8);

        // [2, 4, 6, 3, 8]

        System.out.println(ll.findMiddleNode().value); // 6

        ll.append(21); // [2, 4, 6, 3, 8, 21]
        System.out.println(ll.findMiddleNode().value); // 3
    }
}
