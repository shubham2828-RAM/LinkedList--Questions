package LinkListByDSA;

public class nthNodeFromEnd {
//    where Node is the data type which is used in the function and also called return type of the function
    public static Node nthnode(Node head, int n ){
        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp= temp.next;
        }
        int m = size - n + 1; /*This formula is used from the Arithmatic prograssion AP */
        temp = head;
        for (int i =1; i<= m-1;i++){
            temp= temp.next;
        }
        return temp;
    }
//    we used this 2th option i.e Node nthnode2 bcz to reduce it one tranverse (do in one tranverse) also called rabbit and tortoise method
    public static Node nthnode2(Node head,int n){
        Node slow = head;
        Node fast = head;
        for (int i =1; i<= n;i++){
            fast = fast.next;

        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node Deletenode(Node head , int n ){
        Node slow = head;
        Node fast = head;
        for (int i=1; i<= n;i++){
            fast = fast.next;
        }
        if (fast == null){
            head= head.next;
            return head;
        }
        while (fast.next != null){
            slow =slow.next;
            fast= fast.next;
        }
         slow.next = slow.next.next;
        return head;

    }
    public static void deletenode(Node head, int n ){  /*by this function we can delete the node from the given list
    but in this one problem will arise i.e we cannot delete the node from the list which is at  the head,it found that
     jump to outside the length*/
        Node slow = head;
        Node fast = head;
        for (int i=1; i<=n;i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow =slow.next;
            fast= fast.next;
        }
         slow.next = slow.next.next;

    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        Node q = nthnode(a,3);
//        System.out.println(q.data);
        display(a);
        System.out.println();
//        deletenode(a,5);  /*this function will run till n-1 (n is the size of the list)*/
//          display(a);
        System.out.println();
         a= Deletenode(a,6);/*this function will run for all nodes includes head or at 6 also */
         display(a);

    }
}
