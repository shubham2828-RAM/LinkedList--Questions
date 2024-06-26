package LinkListByDSA;

public class GetIntersectionNode {
    public static Node getintersectionnode1(Node headA,Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int sizeA = 0;
        while (tempA != null){
            sizeA++;
            tempA = tempA.next;
        }
        int sizeB = 0;
        while (tempB != null){
            sizeB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (sizeA > sizeB){
            int steps = sizeA - sizeB;
            for (int i =1; i<=steps;i++){
                tempA = tempA.next;
            }
        }
        else {
            int steps = sizeB -sizeA;
            for (int i =1; i<=steps;i++){
                tempB = tempB.next;
            }
            while (tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;

            }
        }
        return tempA;
    }
    public static void display(Node head){


    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }

    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8); /*common point*/
        Node e = new Node(10);
        Node f = new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        2 - 4 - 6 - 8 - 10 - 12
        Node g = new Node(3);
        Node h = new Node(6);
//        Node d = new Node (data:8);
        g.next=h;
        h.next=d;







    }
}
