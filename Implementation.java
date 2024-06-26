package LinkListByDSA;

public class Implementation {
    public static class Node
    {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class Linkedlist
    {
        Node head = null;
        Node tail = null;
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail=temp;
            }
            else {
                tail.next = temp;
                tail =temp;
            }
        }
        void insertAtHead(int val)
        {
            Node temp = new Node(val);
            if (head == null) { /* empty list*/
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }

        }
        void insertAt(int idx, int val){
           Node t = new Node(val);
            Node temp = head;
            if (idx == size()){
               inserAtEnd(val);  /*we have done this so that value of the tail not get effected*/
               return;
           }
            else if (idx == 0){
                insertAtHead(val);/*we have done this sp that value of the head not get effected*/
                return;
            }
            else if (idx  < 0){
                System.out.println("Wrong index");
                return;
            }
            else if (idx > size()){
                System.out.println("Wrong index");
                return;
            }
           for (int i =1; i<= idx-1; i++){
               temp = temp.next;
           }
           t.next = temp.next;
           temp.next = t;

        }
        int getAt(int idx){
            Node temp = head;
            for (int i =1; i<= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
        }
        int size(){
            Node temp = head;
            int count=0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
           return count;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll  = new Linkedlist();
        ll.inserAtEnd(4); /*this is used for inserting the elements in the end or tail*/
        ll.inserAtEnd(5);
        ll.display();
        System.out.println();
        ll.insertAtHead(3); /* this is used for inserting the element in the head or starting */
        ll.display();
        System.out.println();
        ll.insertAt(2,10);/*this is used for inserting the element at the particular position */
        ll.display();
        System.out.println();
        System.out.println("The size : "+ll.size());
        System.out.println(ll.tail.data);
        System.out.println(ll.getAt(2));  /*by this we can get the value of the inputed index i.e: 10 at index 2*/


    }
}
