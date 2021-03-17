// Stack = LIFO
// Example: ctrl+z to undo most recent operation.

public class StackOfInts
{
    private final int size = 10; // size of Stack
    private Integer[] data; // array reference for constructor
    private int top; // represents top of stack, want to increment/decrement with push/pop so we don't have to keep shifting the array

    public StackOfInts()
    {
        data = new Integer[size];
        top = 0;
    }

    public void push(int val)
    {
        if(top < size)
        {
            data[top] = val;
            top++; //move our top over to put more on
        }
        else
        {
            System.out.println("size exceeds stack limit");
            return;
        }
    }

    public int pop()
    {
        if(top != 0)
        {
            top--; // decrement to save code space
            int val = data[top];
            data[top] = null; // prevent loitering (just good practice)
            return val;
        }
        else
        {
            return -1; // have to have a return value in case if statement doesn't execute...not the best API design
        }
    }

    public int peek()
    {
        if(top != 0)
        {
            return data[top-1];
        }
        else
        {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        if(top == 0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        // Test client

         StackOfInts s = new StackOfInts();

        for(int i = 0; i < s.size; i++)
        {
            s.push(i); // make our stack
        }

        System.out.println(s.peek());

        while(!s.isEmpty())
        {
            System.out.println(s.pop());

        }
    }

}
