package linkedListU5;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList(10); // [10]

        ll.append(7); // [10, 7]

        ll.prepend(21); // [21, 10, 7]

        System.out.println(ll.removeLast().value); // [21, 10] - 7

        ll.append(34); // [21, 10, 34]

        System.out.println(ll.removeFirst().value); // [10, 34] - 21
        System.out.println();

        ll.append(67);  // [10, 34, 67]
        ll.append(90);  // [10, 34, 67, 90]

        System.out.println("List: ");
        ll.printList();
        System.out.println();

        System.out.println(ll.get(2).value);

        System.out.println(ll.set(1, 50));
        System.out.println(ll.get(1).value);

        System.out.println(ll.insert(2, 31));
        
        System.out.println();
        ll.printList();


    }
}
