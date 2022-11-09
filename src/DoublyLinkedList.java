import java.util.*;

public class DoublyLinkedList {

    public static class merryList {

        private Node head;
        private Node tail;
        private int size;

        public merryList() {
            size = 0;
        }

        private static class Node {
            private Node next;
            private Node prev;
            private Integer pCount;

            Node(Integer pCount) {
                this.pCount = pCount;
                this.next = null;
                this.prev = null;
            }
        }

        public void addFirst(Integer pCount) {
            Node newNode = new Node(pCount);

            if(head != null) {
                newNode.next = head;
                head.prev = tail;
            }

            head = newNode;
            if(head.next == null) {
                tail = head;
            }
            size++;
        }

        public void addLast(Integer pCount) {
            if(size == 0) {
                addFirst(pCount);
            } else {
                Node newNode = new Node(pCount);
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                tail = newNode;
                size++;
            }
        }

        public void add(int index, Integer pCount) {
            if(index == 0) {
                addFirst(pCount);
            } else if(index == size-1) {
                addLast(pCount);
            } else {
                Node newNode = new Node(pCount);
                Node preNode = getNode(index-1);
                Node nextNode = preNode.next;

                newNode.prev = preNode;
                newNode.next = nextNode;

                preNode.next = newNode;

                nextNode.prev = newNode;

                size++;
            }
        }

        public Node getNode(int index) {
            Node node;
            if(index < size/2) {
                node = head;
                for(int i=0; i<index; i++) {
                    node = node.next;
                }
            } else {
                node = tail;
                for(int i=size-1; i>index; i--) {
                    node = node.prev;
                }
            }
            return node;
        }

        public Integer removeFirst() {
            if(size == 0) {
                return null;
            }

            Node removeNode = head;
            head = null;
            head = removeNode.next;
            head.prev = tail;
            size--;

            return removeNode.pCount;
        }

        public Integer removeLast() {
            if(size == 0) {
                return null;
            }

            Node removeNode = tail;
            tail = null;
            tail = removeNode.prev;
            tail.next = head;
            size--;

            return removeNode.pCount;
        }

        public Integer remove(int index) {
            if(size==0) {
                return null;
            }
            if(index == 0) {
                return removeFirst();
            } else if(index == size-1) {
                return removeLast();
            } else {
                Node removeNode = getNode(index);
                Node preNode = removeNode.prev;
                Node nextNode = removeNode.next;

                preNode.next = nextNode;
                nextNode.prev = preNode;

                size--;

                return removeNode.pCount;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        merryList list = new merryList();

        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println(list.getNode(0).pCount);
        System.out.println(list.getNode(1).pCount);
        System.out.println(list.getNode(2).pCount);
        System.out.println(list.getNode(3).pCount);
    }
}
