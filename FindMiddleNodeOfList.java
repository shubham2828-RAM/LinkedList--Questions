package LinkListByDSA;

public class FindMiddleNodeOfList {
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while ( fast != null&& fast.next != null){ /* we done this for even list and to find the right middle node then
        we have to use fast != null*/
            /*but if the list is odd then in the && condition we have to use fast.next != null*/
//            /*above while condition contains both right middle for even list
//            And middle for odd list*/
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }
    public static Node middle2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next.next != null){/*this is used for the left middle of the even list     */
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

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
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node re = middle(a);
        display(a);
        System.out.println();
        Node re2 = middle2(a);
        System.out.println("The left middle of the list is: "+re2.data);
//        System.out.println();
        System.out.println("The right middle of the list is : " +re.data);/*in this if we get the odd list then we also
        get middle value of the odd list */
//the above program is used for both right middle value of the list which is even list and also for the middle of odd list

    }
}
