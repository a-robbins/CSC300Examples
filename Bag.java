/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import java.util.Iterator;

/* Bags are containers (like a marble bag) to store permanent
 * objects for iterating through the entire contents
*/
public class Bag<Item> implements Iterable<Item> {
    GenericList<Item> list; // leverage previous class we made

    Bag() // constructor
    {
        list = new GenericList<Item>(); // create new generic list
    }

    public void add(Item item) {
        list.insertBack(
                item); // HOW COOL IS THIS?! we are able to use the methods from our other code!!
    }

    public boolean isEmpty() {
        if (list.getSize() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        return list.getSize();
    }

    public Iterator<Item> iterator()
    {
        return list.iterator();
    }


    public static void main(String[] args)
    {
        Bag<Integer> bag = new Bag<Integer>(); // client

        for (int i = 0; i < 100; i++) {
            bag.add(i);
        }

        for (int x : bag)
        {
            StdOut.print(x);
            StdOut.print("\n");
        }
    }
  }




