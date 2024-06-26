package LinkListByDSA;

public class LinkListPro {
    public static void displayRec(Node head){
//      base case
        if (head == null)  return;
//         self work
        System.out.print(head.data+" ");
//        recursive work
        display(head.next);

    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }
    public static int length(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;

        }
        return count;

    }
    public static class Node{
        int data ;
        Node next;
        Node(int data){
        this.data = data;
    }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
//        System.out.println(a.next);
//        System.out.println(b);
        a.next =b;
        b.next = c;
        c.next =d;
        d.next =e;
        Node temp = a ;
//        for (int i =1; i<=5;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//            }

//        we can simply use the while loop for which a is at head and also the size of the array is not defined.

//        while (temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

        System.out.println();

        display(a);/*we can print the elements of the array  by calling the function */
        System.out.println();

        displayRec(a);/* we can print the element of the array by calling function but in this recursion is used    0  */

        System.out.println();
        System.out.println("The Length of the LinkList: "+length(a));


    }
}
