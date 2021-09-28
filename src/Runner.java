

public class Runner {
    
    public static void main(String[] args) {
        String str = "(a+b)+(a+b)";
        System.out.println(MatchParanthesis.Check(str));

        Node head = null;

        head = Node.push(head, 10);
        head = Node.push(head, 2);
        head = Node.push(head, 3);
        head = Node.push(head, 16);
        Node.PrintList(head);
        //prints list before sort

        Node.SelectionSortList(head);
        Node.PrintList(head);
        //prints list after selection sort
        

        
    }


}
