package LinkedList;

// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class containing all operations
class LinkedList {
    Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node by value
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Search for a node
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class to test the linked list
public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtEnd(30);

        System.out.println("Linked List after insertions:");
        list.display();

        list.deleteNode(20);
        System.out.println("Linked List after deleting 20:");
        list.display();

        System.out.println("Searching for 10: " + list.search(10));
        System.out.println("Searching for 50: " + list.search(50));
    }
}
