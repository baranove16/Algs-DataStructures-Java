public class Node {
    int value;
    Node next;

    //method to insert node at the beginning of the list
    public static Node push(Node addThishead, int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = addThishead;

        addThishead = newNode;

        return addThishead;
    }

    public static void PrintList (Node head) {
        while (head != null)
        {
            System.out.println(head.value + "");
            head = head.next;
        }
    }

    public static void SelectionSortList (Node head) {
        
     Node current = head;
 
     // traverse through the list, setting min node at head and a node
     //for the next node to the head
     while (current != null) {
        Node min = current;
        Node t = current.next;
 
        //traverse through the list, if min node's value is greater than next node
        //min is set to be next node
        while (t != null) {
            if (min.value > t.value)
                min = t;
 
            t = t.next;
        }
        //swap the values
        int i = current.value;
        current.value = min.value;
        min.value = i;
        current = current.next;
      }
    }
    //time complexity of selection sort algorithm -- while loop nested within a while loop, O(n^2)
  

}
    

