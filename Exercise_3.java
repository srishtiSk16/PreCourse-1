//Time and space complexities
//Time Complexity : insert(): O(1), printList(): O(N)
//Space Complexity : O(N) (as we are creating a new list)
import java.io.*;

// Java program to implement
// a Singly Linked List
class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = node;
        }

            // Else traverse till the last node
            // and insert the new_node there
        else{
            Node temp = list.head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = node;
            // Insert the new_node at last node

        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node temp = list.head;

        while(temp!=null){
            // Print the data at current node
            // Go to next node
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}