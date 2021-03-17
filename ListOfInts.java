/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ListOfInts
{

    private class Node
    {
        int val; // reference -- same as pointer
        Node next;

        public Node(int v) //constructor
        {
            val = v;
            next = null;
        }
    }

    Node head; // instance variable
    Node tail;

    public  ListOfInts()
    {
        head = null;
        tail = null;
    }

    public void print() {
        Node walker = head;

        StdOut.print("head ---> ");
        print(head); // calling our recursive function
  /*      while (walker != null)
        {

            StdOut.printf("%d ---> ", walker.val);
            walker = walker.next;
        }

   */
        StdOut.print("null\n");
    }

    private void print(Node n) // overloaded
    {
        if(n == null)
        {
            return;
        }
        // recursive print function
        StdOut.printf("%d ---> ", n.val);
        print(n.next);

    }

    public void insertFront(int val) {
        Node n = new Node(val);

        if (head != null) {
            n.next = head;
        }
        else
        {
            tail = n; // head and tail point to same if list empty
        }
        head = n;

    }

    public void insertBack(int val)
    {
        Node n = new Node(val);

        if(head == null) // list only has one element
        {
            head = n;
            tail = head;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
    }

    public boolean inList(int val)
    {
        Node walker = head;

        while(walker != null)
        {
            if(walker.val == val)
            {
                return true;
            }
            else
            {
                walker = walker.next;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        ListOfInts ll = new ListOfInts();

        while (StdIn.isEmpty() == false)
        {
            ll.insertFront(StdIn.readInt());
            ll.print();

            if (ll.inList(20)) {
                StdOut.print("found it!\n");
            }
        }

    }
}

