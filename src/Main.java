public class Main {
        public static void printList(Node head) {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.data + " — ");
                ptr = ptr.next;
            }
        }
        public static Node inversion(Node head) {
            Node previous = null;
            Node current = head;
            while (current != null) {
                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
        }
        public static void main(String[] args){
            int[] numbers = {1, 3, 5, 7, 9, 11};

            Node head = null;
            for (int i = numbers.length - 1; i >= 0; i--) {
                head = new Node(numbers[i], head);
            }
            head = inversion(head);
            printList(head);
        }
    }