package coding.linkedListU5;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList(10); // [10]

        ll.append(7); // [10, 7]
        ll.prepend(21); // [21, 10, 7]

        System.out.println(ll.removeLast().value); // [21, 10] -> 7
        ll.append(34); // [21, 10, 34]

        System.out.println(ll.removeFirst().value); // [10, 34] -> 21
        System.out.println();

        ll.append(67);  // [10, 34, 67]
        ll.append(90);  // [10, 34, 67, 90]

        System.out.println("List: ");
        ll.printList();         // [10, 34, 67, 90]
        System.out.println();

        System.out.println(ll.get(2).value);    // 67

        System.out.println(ll.set(1, 50));      // true -> [10, 50, 67, 90] 
        System.out.println(ll.get(1).value);    // 50

        System.out.println(ll.insert(2, 31));   // true -> [10, 50, 31, 67, 90] 

        System.out.println(ll.remove(3).value);    // [10, 50, 31, 90] -> 67
        
        System.out.println();
        ll.printList();

        System.out.println("After reverse: ");
        ll.reverse();           // [90, 31, 50, 10]
        ll.printList();

        ll.clear();
        System.out.println("After clear: ");
        ll.printList();

    }
}
