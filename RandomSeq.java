/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
import edu.princeton.cs.algs4.MinPQ; 
import edu.princeton.cs.algs4.StdIn;
// When we compile need to use javac-introcs wrapper script
public class RandomSeq {
    public static void main(String[] args) {
        if (args.length < 3)
        {
            /* How we are used to writing
            StdOut.println("Error: invalid number arguments");
            return;
            */
            // New way to write in "Java Speak"
            throw new IllegalArgumentException("Error: invalid number arguments");

        }

        // Casting from string to int (because string is our arg type in main)
        int count = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        for (int i = 0; i < count; i++)
        {
            /* Using book library...x is a temp variable here. It will provide a uniform
            distribution of random numbers in the range of min to max
             */
            double x = StdRandom.uniform(min, max);
            StdOut.printf("%.2f\n", x);
        }

    }
}
